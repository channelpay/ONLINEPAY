package com.example.store.service.manage;

import java.util.Map;
import com.example.store.model.BookStoreManage;

/**
 * 管理用户业务逻辑层：
 * 
 * @author ONEC
 *
 */
public interface IBookStoreManagerService {
    /**
     * 注册管理
     * 
     * @param registMap
     * @return BookStoreManage
     */
    BookStoreManage register(Map<String, Object> registMap);

    /**
     * 登录手机密码验证
     * 
     * @param phone ,password
     * @return boolean
     */
    boolean login(String phone, String password);
}
