package com.example.store.service.shiro;

import java.util.Map;
import com.example.store.model.shiro.Role;
import com.example.store.model.shiro.User;

/**
 * 用户验证登陆service（shiro）
 * 
 * @author 26500
 *
 */
public interface ILoginService {
    // 用户名查询用户
    User findUserName(String username);

    // 添加用户
    User addUser(Map<String, Object> map);

    // 添加角色
    Role addRole(Map<String, Object> map);
}
