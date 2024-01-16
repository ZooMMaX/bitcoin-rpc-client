package ru.zoommax.bitcoin;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class JsonRpcClient {
    private static final ObjectMapper mapper = new ObjectMapper(); //.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private static Logger logger = LoggerFactory.getLogger(JsonRpcClient.class);
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            //.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.1.32", 3128)))
            .build();
    private static transient AtomicInteger inc = new AtomicInteger(0);

    protected OkHttpClient client = okHttpClient;
    protected String username;
    protected String password;
    protected String url;

    public JsonRpcClient(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    protected <U, T extends JsonRpcResult<U>> U no200error(Request request, Response response, Class<T> result) {
        throw new HttpException(response, "Response Not 2xx ERROR, [%s,%s]", response.code(), response.message());
    }

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

    public JsonRpcClient setOkHttpClient(OkHttpClient client) {
        this.client = client;
        return this;
    }

    public int getId() {
        int ii = inc.addAndGet(1);
        if (ii >= 9_999) {
            inc.set(0);
        }
        return ii;
    }
}
