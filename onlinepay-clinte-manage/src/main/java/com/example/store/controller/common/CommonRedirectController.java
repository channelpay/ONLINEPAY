package com.example.store.controller.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面跳转公共各类
 *
 */
@Controller
@RequestMapping(value = "/common")
public class CommonRedirectController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonRedirectController.class);

    @RequestMapping(value="/{directory}/{respPage}",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView redirect(@PathVariable("directory") String directory , @PathVariable("respPage") String respPage, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("html/" + directory +"/"+ respPage);
        String ipAddress = request.getRemoteAddr();
        LOGGER.info("当前用户：{}：跳转地址为:{}",ipAddress,respPage);
        return modelAndView;
    }

//    @RequestMapping(value="test",method = {RequestMethod.GET,RequestMethod.POST})
//    public ModelAndView test(@PathVariable("directory") String directory , @PathVariable("respPage") String respPage, HttpServletRequest request){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("html/" + directory +"/"+ respPage);
//        String ipAddress = request.getRemoteAddr();
//        LOGGER.info("当前用户：{}：跳转地址为:{}",ipAddress,respPage);
//        return modelAndView;
//    }
}
