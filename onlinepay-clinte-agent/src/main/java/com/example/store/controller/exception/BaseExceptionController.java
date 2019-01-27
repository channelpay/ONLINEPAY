package com.example.store.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.store.controller.exception.product.ProductNotFindException;

/**
 * 全局异常处理
 * 
 * @author ONEC
 *
 */
@ControllerAdvice
public class BaseExceptionController {

    // 定义特定的异常处理方法
    @ExceptionHandler(value = ProductNotFindException.class)
    public ResponseEntity<Object> exception(ProductNotFindException prException) {
        return new ResponseEntity<Object>("not find product", HttpStatus.OK);
    }
}
