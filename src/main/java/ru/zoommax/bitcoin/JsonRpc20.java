package ru.zoommax.bitcoin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class JsonRpc20 implements Serializable {
    private static final ObjectMapper mapper = new ObjectMapper();

    private final String jsonrpc = "2.0";
    private String method;
    private Object params;
    private int id;

    public static class Builder {
        private JsonRpc20 json = new JsonRpc20();

        public Builder setMethod(String method) {
            this.json.setMethod(method);
            return this;
        }

        public Builder setParams(Object params) {
            this.json.setParams(params);
            return this;
        }

        public Builder setId(int id) {
            this.json.setId(id);
            return this;
        }

        public Builder appendParams(Optional<?> params) {
            appendParams(params.orElse(null));
            return this;
        }

        /**
         * NOT skip null !
         *
         * @param params
         * @return
         */
        public Builder appendParams(Object params) {
            Object pam = this.json.getParams();
            Collection list;
            if (pam == null) {
                list = new ArrayList<>();
            } else if (pam instanceof Collection) {
                list = ((Collection) pam);
            } else if (pam.getClass().isArray()) {
                list = Arrays.asList(pam);
            } else {
                list = new ArrayList<>();
                list.add(pam);
            }
            list.add(params);
            this.setParams(list);
            return this;
        }

        public JsonRpc20 getJson() {
            return json;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public String toJson() {
        try {
            if (method == null) {
                throw new RpcException("Method not null !");
            }
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RpcException(e, "Convert to JSON error !");
        }
    }
}
