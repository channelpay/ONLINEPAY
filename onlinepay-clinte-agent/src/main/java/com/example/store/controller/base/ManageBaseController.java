package com.example.store.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.store.service.manage.IBookStoreManagerService;

/**
 * 管理员控制层
 * 
 * @author ONEC
 *
 */
@Controller
public class ManageBaseController {

    @Autowired
    protected IBookStoreManagerService bookStoreManagerService;
}
