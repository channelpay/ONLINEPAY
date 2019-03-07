package com.example.store.exception;

import javax.naming.AuthenticationException;

/**
 * 登陆异常
 * 
 * @author 26500
 *
 */
public class LoginException extends AuthenticationException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public final static String[] LOGIN_NAME_NOT_FIND = {"1001", "当前用户名不存在"};

    public final static String[] LOGIN_PASS_NOT_FIND = {"1002", "密码验证错误"};

    public final static String[] LOGIN_NAME_ERROR = {"1003", "当前用户名状态异常"};

    public final static String[] LOGIN_CODE_NOT_FIND = {"1004", "验证码发送失败"};

    public final static String[] LOGIN_PHONE_ERROR = {"1005", "当前手机号错误"};

    public final static String[] LOGIN_MESSAGE_ERROR = {"1006", "登陆信息错误"};

    public LoginException(String respCode, String respMsg) {
    }

    // public LoginException instanceException(String respCode, String respMsg) {
    // this.setRespMsg(respCode, respMsg);
    // return this;
    // }
}
