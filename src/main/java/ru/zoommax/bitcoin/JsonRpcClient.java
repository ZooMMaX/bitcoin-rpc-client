package ru.zoommax.bitcoin;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.zoommax.bitcoin.annotation.ErrorBody;
import ru.zoommax.bitcoin.parser.OpenDocs;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The type Json rpc client.
 */
public class JsonRpcClient {
    /**
     * The constant mapper.
     */
    private static final ObjectMapper mapper = new ObjectMapper(); //.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    /**
     * The constant logger.
     */
    private static Logger logger = LoggerFactory.getLogger(JsonRpcClient.class);
    /**
     * The constant okHttpClient.
     */
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            //.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.1.32", 3128)))
            .build();
    /**
     * The constant inc.
     */
    private static transient AtomicInteger inc = new AtomicInteger(0);

    /**
     * The Client.
     */
    protected OkHttpClient client = okHttpClient;
    /**
     * The Username.
     */
    protected String username;
    /**
     * The Password.
     */
    protected String password;
    /**
     * The Url.
     */
    protected String url;

    /**
     * Instantiates a new Json rpc client.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public JsonRpcClient(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    /**
     * No 200 error u.
     *
     * @param <U>      the type parameter
     * @param <T>      the type parameter
     * @param request  the request
     * @param response the response
     * @param result   the result
     * @return the u
     */
    protected <U, T extends JsonRpcResult<U>> U no200error(Request request, Response response, Class<T> result) {
        if (this.getClass().isAnnotationPresent(ErrorBody.class)) {
            try {
                String resp = response.body().string();
                String doc = new ObjectMapper().readTree(resp).get("error").get("message").asText();
                if (Desktop.isDesktopSupported()) {
                    Thread thread = new OpenDocs(doc);
                    thread.start();
                    thread.join();
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        throw new HttpException(response, "Response Not 2xx ERROR, [%s,%s]", response.code(), response.message());
    }

    /**
     * Post u.
     *
     * @param <U>    the type parameter
     * @param <T>    the type parameter
     * @param json   the json
     * @param result the result
     * @return the u
     */
    public <U, T extends JsonRpcResult<U>> U post(JsonRpc20 json, Class<T> result) {
        if (json.getId() <= 0) {
            json.setId(this.getId());
        }
        RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), json.toJson());
        String basic = Credentials.basic(this.username, this.password);
        Request request = new Request.Builder()
                .addHeader("Authorization", basic)
                .url(this.url)
                .post(body)
                .build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            if (response.code() / 100 != 2) {
                return no200error(request, response, result);
            } else {
                String resp = response.body().string();
                if (logger.isDebugEnabled()) {
                    logger.info("Request {} Headers ::: \n{}\nContent:: {}", request.url(),
                            response.headers().toString(), resp);
                }
                T value = mapper.readValue(resp, result);
                if (value.getId() != json.getId()) {
                    throw new RpcException("Id NOT compare %s : %s", value.getId(), json.getId());
                }
                return value.getResult();
            }
        } catch (IOException ex) {
            throw new RuntimeException("IO exception !", ex);
        }
    }

    /**
     * Sets ok http client.
     *
     * @param client the client
     * @return the ok http client
     */
    public JsonRpcClient setOkHttpClient(OkHttpClient client) {
        this.client = client;
        return this;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        int ii = inc.addAndGet(1);
        if (ii >= 9_999) {
            inc.set(0);
        }
        return ii;
    }
}
