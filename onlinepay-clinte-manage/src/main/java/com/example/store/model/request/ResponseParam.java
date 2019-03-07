package com.example.store.model.request;

/**
 * 返回数据包装
 * @author ONEC
 *
 */
public class ResponseParam<T> {

    private String msg;

    private int code;

    private double count;

    private T data;

    public ResponseParam() {
    }

    public ResponseParam(String msg, int code, double count, T data) {
        this.msg = msg;
        this.code = code;
        this.count = count;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseParam{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
