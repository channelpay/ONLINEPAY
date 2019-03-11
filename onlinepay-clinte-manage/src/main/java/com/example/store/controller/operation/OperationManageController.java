package com.example.store.controller.operation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.store.controller.base.BaseController;
import com.example.store.model.manage.ManageEnum;
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
@RequestMapping(value = "operation")
public class OperationManageController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationManageController.class);

    /**
     * 获取所有用户的数据（当前权限为：admin）
     * @param request
     * @return
     */
    @RequestMapping(value = "getAllOperation")
    public ResponseParam<List<UserInfo>> getOperationDetail(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        LOGGER.info("当前用户：{}：查询用户ip:{}", httpSession.getAttribute("showname"), request.getRemoteAddr());
        List<UserInfo> userInfoList = operationService.findAllOperation();
        return new ResponseParam<List<UserInfo>>("", 0, userInfoList.size(), userInfoList);
    }

    /**
     * 修改用户状态
     * @param request
     * @param userId
     * @param
     * @return boolean
     */
    @RequestMapping(value="updateOperationStatus")
    public boolean updateOperationStatus(HttpServletRequest request, Integer userId){
        HttpSession httpSession = request.getSession();
        LOGGER.info("当前用户：{}：修改用户状态ip:{}", httpSession.getAttribute("showname"), request.getRemoteAddr());
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userId);
        return operationService.updateOperation(userInfo);
    }
}
