package com.example.store.controller.login;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.store.controller.base.ManageBaseController;

/**
 * @version
 * @since 2018-10-22
 * @author ONEC
 *
 */
@Controller
public class ManageLoginController extends ManageBaseController {

    private static final Log logger = LogFactory.getLog(ManageLoginController.class);



    /**
     * 跳转登录页面 get 跳转登陆页面
     * 
     * @return
     */
    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public ModelAndView toLoginManage(HttpServletRequest request, ModelMap model) {
        String ipAddress = request.getRemoteAddr();
        logger.info("(不考虑nginx 反向代理)当前登录的IP是：" + ipAddress);
        ModelAndView moView = new ModelAndView();
        moView.setViewName("/html/manage/ManageLogin");
        return moView;
    }

    /**
     * 认证页面 post 验证登陆页面
     * 
     * @return
     */
    @RequestMapping(value = "/toLogin", method = RequestMethod.POST)
    public String loginManage(String username, String password, HttpServletRequest request, ModelMap model) {
        logger.info("用户登陆信息是：" + username + "密码信息：" + password);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        try {
            subject.login(usernamePasswordToken);
        } catch (UnknownAccountException user) { // 未知用户
            logger.info("对用户[" + username + "]进行登录验证..验证未通过,未知账户");
            model.addAttribute("message", "用户名输入有误");
        } catch (IncorrectCredentialsException ics) { // 未知用户
            logger.info("对用户[" + username + "]进行验证..验证未通过,凭证验证错误");
            model.addAttribute("message", "用户名或者密码错误");
        } catch (LockedAccountException lock) { // 未知用户
            logger.info("对用户[" + username + "]进行验证..验证未通过,用户状态锁定");
            model.addAttribute("message", "用户状态已锁定");
        } catch (ExcessiveAttemptsException excess) { // 未知用户
            logger.info("对用户[" + username + "]进行验证..验证未通过,登录次数超限");
            model.addAttribute("message", "登录次数超限");
        } catch (AuthenticationException ae) { // 未知用户
            logger.info("对用户[" + username + "]进行验证..验证未通过,用户名或密码错误");
            ae.printStackTrace();
            model.addAttribute("message", "用户名或密码错误");
        }
        return "/html/manage/ManageLogin";
        // return "/html/maindetail/mainDetail";
    }

    /**
     * shiro 认证成功跳转
     * 
     * @return
     */
    @RequestMapping(value = "/manage/manageMenu")
    public String success(HttpServletRequest request) {
        return "/html/manage/ManageMenu";
    }
    // real 方法中已经实现了登陆所以在此处只需要获取登陆异常即可
    // Subject subject = SecurityUtils.getSubject();
    // UsernamePasswordToken usernamePasswordToken =
    // new UsernamePasswordToken(username, password);
    // // 用户验证 捕获异常提示相关信息
    // try {
    // subject.login(usernamePasswordToken);
    // session.setAttribute("user", usernamePasswordToken.getPrincipal());
    // } catch (AuthenticationException e) {
    // e.printStackTrace();
    // }
    // // 根据shiro返回的异常类路径判断，抛出指定异常信息

    /**
     * 跳转登录失败/或者未授权页面
     * 
     * @return
     */
    @RequestMapping(value = "/toFailed", method = RequestMethod.GET)
    public ModelAndView toFailed(HttpServletRequest request) {
        String ipAddress = request.getRemoteAddr();
        logger.info("(不考虑nginx 反向代理)当前登录的IP是：" + ipAddress);
        ModelAndView moView = new ModelAndView();
        moView.setViewName("html/manage/ManageLogin");// 成功跳转到主页
        return moView;
    }

    /**
     * shiro 登出操作
     * 
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "/html/manage/ManageLogin";
    }
}
