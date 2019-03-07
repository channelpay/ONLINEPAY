package com.example.store.controller.operation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.store.controller.base.BaseController;
import com.example.store.model.manage.UserInfo;
import com.example.store.model.request.ResponseParam;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 运营数据管理
 * 数据接口不涉及页面
 */
@RestController
@RequestMapping(value="operation")
public class OperationManageController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationManageController.class);

    @RequestMapping(value = "getAllOperation")
    public ResponseParam<List<UserInfo>> getOperationDetail(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        LOGGER.info("当前用户：{}：查询用户ip:{}",httpSession.getAttribute("showname"),request.getRemoteAddr());
        List<UserInfo> userInfoList = operationService.findAllOperation();
//        Map<String,String> respMap = new HashedMap();
//        respMap.put("code", 0);
//        respMap.put("msg","数据处理成功");
//        respMap.put("count","20");
//        respMap.put("data",JSONObject.toJSONString(userInfo));
        return new ResponseParam<List<UserInfo>>("",0,userInfoList.size(), userInfoList);
    }
}
