package ru.zoommax.bitcoin;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HttpException extends RuntimeException {
    private static final ObjectMapper mapper = new ObjectMapper(); //.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private static final Logger logger = LoggerFactory.getLogger(HttpException.class);

    Response response;
    private String body;

    public HttpException(Response response, String format, Object... param) {
        this(response, null, format, param);
    }

    public HttpException(Response response, Throwable cause, String format, Object... param) {
        super(String.format(format, param), cause);
        this.response = response;
    }

    public Response getResponse() {
        return response;
    }

    public JsonRpcResult.Error tryJsonError() {
        try {
            return mapper.readValue(getBodyString(), JsonRpcResult.class).getError();
        } catch (IOException e) {
            return null;
        }
    }


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

    private String getBodyString() throws IOException {
        if (body == null) {
            body = response.body().string();
        }
        //return "response.body().string(), IOException :: " + e.getMessage();
        return body;
    }
}
