package ru.zoommax.bitcoin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

/**
 * The type Json rpc 20.
 */
public class JsonRpc20 implements Serializable {
    /**
     * The constant mapper.
     */
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * The Jsonrpc.
     */
    private final String jsonrpc = "2.0";
    /**
     * The Method.
     */
    private String method;
    /**
     * The Params.
     */
    private Object params;
    /**
     * The Id.
     */
    private int id;

    /**
     * The type Builder.
     */
    public static class Builder {
        /**
         * The Json.
         */
        private JsonRpc20 json = new JsonRpc20();

        /**
         * Sets method.
         *
         * @param method the method
         * @return the method
         */
        public Builder setMethod(String method) {
            this.json.setMethod(method);
            return this;
        }

        /**
         * Sets params.
         *
         * @param params the params
         * @return the params
         */
        public Builder setParams(Object params) {
            this.json.setParams(params);
            return this;
        }

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public Builder setId(int id) {
            this.json.setId(id);
            return this;
        }

        /**
         * Append params builder.
         *
         * @param params the params
         * @return the builder
         */
        public Builder appendParams(Optional<?> params) {
            appendParams(params.orElse(null));
            return this;
        }

        /**
         * Append params builder.
         *
         * @param params the params
         * @return the builder
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

        /**
         * Gets json.
         *
         * @return the json
         */
        public JsonRpc20 getJson() {
            return json;
        }
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets jsonrpc.
     *
     * @return the jsonrpc
     */
    public String getJsonrpc() {
        return jsonrpc;
    }

    /**
     * Gets method.
     *
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets method.
     *
     * @param method the method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Gets params.
     *
     * @return the params
     */
    public Object getParams() {
        return params;
    }

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(Object params) {
        this.params = params;
    }

    /**
     * To json string.
     *
     * @return the string
     */
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
