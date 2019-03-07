package com.example.store.config.shiroutil;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.store.model.manage.UserInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * shiro 登陆成功重写方法
 *
 * @author 26500
 */
public class ShiroSuccessUtil extends FormAuthenticationFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShiroSuccessUtil.class);
    /**
     * 重写登陆成功方法
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
                                     ServletResponse response) throws Exception {
        HttpServletRequest httpRequest = WebUtils.toHttp(request);
        HttpSession httpSession = httpRequest.getSession();
        // 待理解 解决
        UserInfo userInfo = (UserInfo) subject.getPrincipal();
//        if (user instanceof User) {
//        } else {
//            user = JSONObject.parseObject(JSONObject.toJSONString(user), User.class);
//        }
        LOGGER.info("当前管理者：{} 登录成功",userInfo.getUserName());
        httpSession.setAttribute("showname", userInfo.getUserName());
        WebUtils.issueRedirect(httpRequest, response, "/manage/manageMenu");
        return true;
    }
}
