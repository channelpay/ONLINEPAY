package com.example.store.controller.base;

import com.example.store.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    @Autowired
    protected OperationService operationService;

}
