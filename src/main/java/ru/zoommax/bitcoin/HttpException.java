package ru.zoommax.bitcoin;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * The type Http exception.
 */
public class HttpException extends RuntimeException {
    /**
     * The constant mapper.
     */
    private static final ObjectMapper mapper = new ObjectMapper(); //.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    /**
     * The constant logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(HttpException.class);

    /**
     * The Response.
     */
    Response response;
    /**
     * The Body.
     */
    private String body;

    /**
     * Instantiates a new Http exception.
     *
     * @param response the response
     * @param format   the format
     * @param param    the param
     */
    public HttpException(Response response, String format, Object... param) {
        this(response, null, format, param);
    }

    /**
     * Instantiates a new Http exception.
     *
     * @param response the response
     * @param cause    the cause
     * @param format   the format
     * @param param    the param
     */
    public HttpException(Response response, Throwable cause, String format, Object... param) {
        super(String.format(format, param), cause);
        this.response = response;
    }

    /**
     * Gets response.
     *
     * @return the response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Try json error json rpc result . error.
     *
     * @return the json rpc result . error
     */
    public JsonRpcResult.Error tryJsonError() {
        try {
            return mapper.readValue(getBodyString(), JsonRpcResult.class).getError();
        } catch (IOException e) {
            return null;
        }
    }


    /**
     * Logger.
     */
    public void logger() {
        try {
            String str = getBodyString();
            Request request = response.request();
            logger.info("Request TRANCE:: POST {}\n=== header ===\n{}=== body ===\n{}\nResponse TRANCE::\n=== header ===\n[{}] :: {}\n{}=== body ===\n{}",
                    request.url(), //
                    request.headers(), request.body(), //
                    response.code(), response.message(),
                    response.headers(), str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Gets body string.
     *
     * @return the body string
     * @throws IOException the io exception
     */
    private String getBodyString() throws IOException {
        if (body == null) {
            body = response.body().string();
        }
        //return "response.body().string(), IOException :: " + e.getMessage();
        return body;
    }
}
