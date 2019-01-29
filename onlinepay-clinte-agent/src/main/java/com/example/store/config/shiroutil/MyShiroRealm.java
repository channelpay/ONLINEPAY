package com.example.store.config.shiroutil;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.store.model.agent.AgentInfo;
import com.example.store.model.agent.AgentParam;
import com.example.store.model.shiro.Permission;
import com.example.store.model.shiro.Role;
import com.example.store.model.shiro.User;
import com.example.store.service.agent.IAgentLoginService;

/**
 * 设计角色以及权限接口
 * 
 * @author 26500
 *
 */
public class MyShiroRealm extends AuthorizingRealm {

    // 用于用户查询
    @Autowired
    private IAgentLoginService loginService;

    // 角色权限和对应权限添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取登录用户名
        String name = (String) principalCollection.getPrimaryPrincipal();
        // 查询用户名称
        AgentParam agentParam = loginService.findUserName(name);
        // 添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        /*
         * for (Role role : user.getRoles()) { // 添加角色
         * simpleAuthorizationInfo.addRole(role.getRoleName()); for (Permission permission :
         * role.getPermissions()) { // 添加权限
         * simpleAuthorizationInfo.addStringPermission(permission.getPermission()); } }
         */
        return simpleAuthorizationInfo;
    }

    /**
     * 用户登陆认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        // 加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 获取用户信息
        String name = token.getPrincipal().toString();
        AgentParam agentParam = loginService.findUserName(name);
        if (agentParam == null) {
            throw new UnknownAccountException();
        } else {
            // 获取用户的盐值
            ByteSource salt = ByteSource.Util.bytes(agentParam.getAgDeskey());
            // 这里验证authenticationToken和simpleAuthenticationInfo的信息（此处设置的为：user：subject.getPrincipal()
            // 获取到的是user对象 ）
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                    agentParam, agentParam.getAgPassword(), salt, getName());
            return simpleAuthenticationInfo;
        }
    }
}
/*
 * // token携带了用户信息 UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)
 * authenticationToken; // 获取前端输入的用户名 String userName = usernamePasswordToken.getUsername(); //
 * 根据用户名查询数据库中对应的记录 User user = loginService.findUserName(userName); // 当前realm对象的name String
 * realmName = getName(); // 盐值 ByteSource credentialsSalt =
 * ByteSource.Util.bytes(user.getUsername()); // 封装用户信息，构建AuthenticationInfo对象并返回 AuthenticationInfo
 * authcInfo = new SimpleAuthenticationInfo(user, user.getPassword(), credentialsSalt, realmName);
 * return authcInfo;
 */
