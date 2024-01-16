/**
 * Copyright 2019 bejson.com
 */
package ru.zoommax.bitcoin;

/**
 * The type Json rpc result.
 *
 * @param <T> the type parameter
 */
public class JsonRpcResult<T> {

    /**
     * The Result.
     */
    private T result;
    /**
     * The Results.
     */
    private T[] results;
    /**
     * The Error.
     */
    private Error error; // {"result":null,"error":{"code":-32600,"message":"Params must be an array or object"},"id":1}
    /**
     * The Id.
     */
    private int id;

    /**
     * Gets result.
     *
     * @return the result
     */
    public T getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(T result) {
        this.result = result;
    }

    /**
     * Get results t [ ].
     *
     * @return the t [ ]
     */
    public T[] getResults() {
        return results;
    }

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(T[] results) {
        this.results = results;
    }

    /**
     * Sets error.
     *
     * @param error the error
     */
    public void setError(Error error) {
        this.error = error;
    }

    /**
     * Gets error.
     *
     * @return the error
     */
    public Error getError() {
        return error;
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
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * The type Error.
     */
    public static class Error {

        /**
         * The Code.
         */
        private int code;
        /**
         * The Message.
         */
        private String message;

        /**
         * Sets code.
         *
         * @param code the code
         */
        public void setCode(int code) {
            this.code = code;
        }

        /**
         * Gets code.
         *
         * @return the code
         */
        public int getCode() {
            return code;
        }

        /**
         * Sets message.
         *
         * @param message the message
         */
        public void setMessage(String message) {
            this.message = message;
        }

        /**
         * Gets message.
         *
         * @return the message
         */
        public String getMessage() {
            return message;
        }

    }
}