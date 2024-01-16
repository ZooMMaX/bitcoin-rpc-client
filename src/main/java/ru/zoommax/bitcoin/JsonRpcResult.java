/**
 * Copyright 2019 bejson.com
 */
package ru.zoommax.bitcoin;

public class JsonRpcResult<T> {

    private T result;
    private T[] results;
    private Error error; // {"result":null,"error":{"code":-32600,"message":"Params must be an array or object"},"id":1}
    private int id;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public T[] getResults() {
        return results;
    }

    public void setResults(T[] results) {
        this.results = results;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Error getError() {
        return error;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static class Error {

        private int code;
        private String message;

        public void setCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

    }
}