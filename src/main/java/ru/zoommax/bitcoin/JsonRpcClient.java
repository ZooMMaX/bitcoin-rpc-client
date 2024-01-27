package ru.zoommax.bitcoin;

import java.awt.Desktop;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Call;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ru.zoommax.bitcoin.annotation.ErrorBody;
import ru.zoommax.bitcoin.parser.OpenDocs;

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
				final String resp = response.body().string();
				final String doc = new ObjectMapper().readTree(resp).get("error").get("message").asText();
				//if (!doc.) {
				if (Desktop.isDesktopSupported()) {
					final Thread thread = new OpenDocs(doc);
					thread.start();
					thread.join();
				}
				//}
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
	@SuppressWarnings("deprecation")
	public <U, T extends JsonRpcResult<U>> U post(JsonRpc20 json, Class<T> result) {
		if (json.getId() <= 0) {
			json.setId(this.getId());
		}
		final RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), json.toJson());
		final String basic = Credentials.basic(this.username, this.password);
		final Request request = new Request.Builder()
				.addHeader("Authorization", basic)
				.url(this.url)
				.post(body)
				.build();
		final Call call = client.newCall(request);
		try {
			final Response response = call.execute();
			if (response.code() / 100 != 2) {
				return no200error(request, response, result);
			} else {
				final String resp = response.body().string();
				if (logger.isDebugEnabled()) {
					logger.info("Request {} Headers ::: \n{}\nContent:: {}", request.url(),
							response.headers().toString(), resp);
				}
				final T value = mapper.readValue(resp, result);
				if (value.getId() != json.getId()) {
					throw new RpcException("Id NOT compare %s : %s", value.getId(), json.getId());
				}
				return value.getResult();
			}
		} catch (final IOException ex) {
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
		final int ii = inc.addAndGet(1);
		if (ii >= 9_999) {
			inc.set(0);
		}
		return ii;
	}
}
