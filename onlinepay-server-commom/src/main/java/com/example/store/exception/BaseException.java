package com.example.store.exception;

import java.text.MessageFormat;

/**
 * 异常base
 * 
 * @author 26500
 *
 */
public class BaseException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected String respCode;

    protected String respMsg;

    public BaseException() {
        super();
    }

    public BaseException(String respCode, String respMsg) {}

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    /**
     * 
     * @param message
     * @param objects
     */
    public void setRespMsg(String message, Object... objects) {
        this.respMsg = MessageFormat.format(message, objects);
    }

    @Override
    public String toString() {
        return "BaseException [respCode=" + respCode + ", respMsg=" + respMsg + "]";
    }

}
