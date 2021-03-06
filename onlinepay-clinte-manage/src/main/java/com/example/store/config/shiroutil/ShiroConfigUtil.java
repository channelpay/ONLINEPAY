package com.example.store.config.shiroutil;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.Filter;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @since 2018-12-03
 * @author 26500 @ shiro 登陆管理权限配置
 */
@Configuration
public class ShiroConfigUtil {

    @Bean
    public ShiroFilterFactoryBean shiroFactory(org.apache.shiro.mgt.SecurityManager securityManager) {
        // 配置拦截器 string
        Map<String, String> filterString = new HashMap<String, String>();
        // 配置不会被拦截的连接顺序判断
        filterString.put("/static/**", "anon");
        // 配置的退出过滤 拦截器 其中的实现shiro 已经处理
        filterString.put("/logout", "logout");
        // 添加成功跳转的过滤器
        // <!-- 过滤链定义，从上向下顺序执行，一般将/**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        filterString.put("/**", "authc");
        // 配置拦截器 string
        Map<String, Filter> filter = new HashMap<String, Filter>();
        filter.put("authc", new ShiroSuccessUtil());

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 如果不设置默认会自动寻找web 工程下的login
        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        // 登陆成功之后显示的url
        shiroFilterFactoryBean.setSuccessUrl("/manage/manageMenu");// 登陆成功跳转地址
        // 认证失败页面配置
        shiroFilterFactoryBean.setUnauthorizedUrl("/toFailed");
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        shiroFilterFactoryBean.setFilters(filter);
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterString);

        return shiroFilterFactoryBean;
    }

    // 将自己的验证方式加入容器
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return myShiroRealm;
    }

    // 权限管理，配置主要是Realm的管理认证
    @Bean
    public org.apache.shiro.mgt.SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    // 加入注解的使用，不加入这个注解不生效 如：@RequiresRoles
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
            org.apache.shiro.mgt.SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor =
                new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    /**
     * 哈希密码比较器。在myShiroRealm中作用参数使用 登陆时会比较用户输入的密码，跟数据库密码配合盐值salt解密后是否一致。
     * 
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");// 散列算法:这里使用md5算法;
        hashedCredentialsMatcher.setHashIterations(1024);// 散列的次数，比如散列两次，相当于 md5( md5(""));
        return hashedCredentialsMatcher;
    }

    /**
     * Shiro生命周期处理器
     * 
     * @return
     */
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * 自动创建代理
     * 
     * @return
     */
    @Bean
    @DependsOn({"lifecycleBeanPostProcessor"})
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
}
