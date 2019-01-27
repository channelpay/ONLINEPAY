package com.example.store.config.shiroutil;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import com.alibaba.fastjson.JSONObject;
import com.example.store.model.shiro.User;

/**
 * shiro 登陆成功重写方法
 * 
 * @author 26500
 *
 */
public class ShiroSuccessUtil extends FormAuthenticationFilter {

    /**
     * 重写登陆成功方法
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
            ServletResponse response) throws Exception {
        // 待理解 解决
        Object user = subject.getPrincipal();
        User realUser;
        if (user instanceof User) {
            realUser = (User) user;
        } else {
            realUser = JSONObject.parseObject(JSONObject.toJSONString(user), User.class);
        }
        HttpServletRequest httpRequest = WebUtils.toHttp(request);
        HttpSession httpSession = httpRequest.getSession();
        httpSession.setAttribute("showname", realUser.getShowname());
        WebUtils.issueRedirect(httpRequest, response, "/manage/manageMenu");
        return true;
    }
}
