package com.example.store.service.login;

import com.example.store.model.manage.ManageEnum;
import com.example.store.model.manage.UserInfo;
import com.example.store.model.request.RequestParam;
import com.example.store.model.sale.SaleInfo;
import com.example.store.service.base.BaseService;
import com.example.store.util.RandomUtil;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 运营登录sevice
 */
@Service
public class UserLoginServiceImpl extends BaseService implements UserLoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserLoginServiceImpl.class);
    /**
     * 登录验证获取用户信息
     * @param username
     * @return saleInfo
     */
    @Override
    public UserInfo findUserName(String username) {
        // 邮箱验证
        String email = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String phone = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";

        UserInfo userInfo ;
        if(username.matches(email)){       // 邮箱登录
            LOGGER.info("管理正在邮箱登录：{}",username);
            userInfo = userInfoMapper.selectByUserEmail(username);
        }else if(username.matches(phone)){ // 手机号登录
            LOGGER.info("管理正在手机登录：{}",username);
            userInfo = userInfoMapper.selectByUserPhone(username);
        }else{                             // 用户名登录
            LOGGER.info("管理正在用户名登录：{}",username);
            userInfo = userInfoMapper.selectByUserName(username);
        }

        return userInfo;
    }

    /**
     * 添加用户
     * @param requestParam
     * @return SaleInfo
     */
    @Override
    public UserInfo addSaleInfo(RequestParam requestParam) {

        UserInfo userInfo = new UserInfo();
        String salt = RandomUtil.getRandom(24);
        ByteSource byteSource = ByteSource.Util.bytes(salt);
        String password = new SimpleHash("MD5",requestParam.getUserPassword(),byteSource,1024).toHex();
        userInfo.setUserSalt(salt);
        userInfo.setUserPassword(password);
        userInfo.setUserPhone(requestParam.getUserPhone());
        userInfo.setUserEmail(requestParam.getUserEmail());
        userInfo.setUserName(requestParam.getUserName());
        userInfo.setUserNo("000001");
        userInfo.setUserStatus(ManageEnum.AVAILABLE);
        userInfoMapper.insert(userInfo);
        return userInfo;
    }
}
