package com.example.store.service.manage;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.store.dao.BookStoreManageMapper;
import com.example.store.model.BookStoreManage;

/**
 * @version 1.0
 * @since 2018-11-11
 * @author ONEC
 *
 */
@Service
public class BookStoreManageServiceImpl implements IBookStoreManagerService {

    private static final Log logger = LogFactory.getLog(BookStoreManageServiceImpl.class);

    @Autowired
    private BookStoreManageMapper bookStoreManageMapper;

    /**
     * 管理员注册信息
     * 
     * @param registMap
     * @since 2018-11-11
     */
    @Override
    public BookStoreManage register(Map<String, Object> registMap) {
        return null;
    }

    /**
     * 管理登录
     * 
     * @param phone password
     */
    @Override
    public boolean login(String phone, String password) {

        return false;
    }

}
