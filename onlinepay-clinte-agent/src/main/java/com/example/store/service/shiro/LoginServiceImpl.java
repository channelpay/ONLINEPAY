package com.example.store.service.shiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.store.dao.shiro.RoleRepository;
import com.example.store.dao.shiro.UserRepository;
import com.example.store.model.shiro.Role;
import com.example.store.model.shiro.User;
import com.example.store.util.RandomUtil;

/**
 * 用户登陆操作实现类（Service）
 * 
 * @author 26500
 *
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User findUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public User addUser(Map<String, Object> map) {
        User user = new User();
        String salt = RandomUtil.getRandom(32);// 生成用户盐值
        String password = new SimpleHash("MD5", map.get("password"), ByteSource.Util.bytes(salt), 1024).toHex();
        user.setSalt(salt);
        user.setUsername(map.get("username").toString());
        user.setPassword(password);
        Role role = new Role();
        role.setId((long) 2);
        List<Role> roles = new ArrayList<Role>();
        roles.add(role);
        user.setRoles(roles);
        user.setId(4L);
        userRepository.save(user);
        System.out.println("用户注册成功：");
        return user;
    }

    @Override
    public Role addRole(Map<String, Object> map) {
        // TODO Auto-generated method stub
        return null;
    }

}
