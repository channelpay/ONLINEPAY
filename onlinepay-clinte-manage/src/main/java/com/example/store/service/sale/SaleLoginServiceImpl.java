package com.example.store.service.sale;

import com.example.store.model.request.RequestParam;
import com.example.store.model.sale.SaleInfo;
import com.example.store.service.base.BaseService;
import com.example.store.util.RandomUtil;
import org.apache.ibatis.annotations.Case;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

/**
 * 运营登录sevice
 */
@Service
public class SaleLoginServiceImpl extends BaseService implements  SaleLoginService {

    /**
     * 登录验证获取用户信息
     * @param username
     * @return saleInfo
     */
    @Override
    public SaleInfo findUserName(String username) {
        // 邮箱验证
        String email = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String phone = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";

        SaleInfo saleInfo ;
        if(username.matches(email)){       // 邮箱登录
            saleInfo = saleInfoMapper.selectByEmail(username);
        }else if(username.matches(phone)){ // 手机号登录
            saleInfo = saleInfoMapper.selectByPhone(username);
        }else{                             // 用户名登录
            saleInfo = saleInfoMapper.selectByUserName(username);
        }

        return saleInfo;
    }

    /**
     * 添加用户
     * @param requestParam
     * @return SaleInfo
     */
    @Override
    public SaleInfo addSaleInfo(RequestParam requestParam) {

        SaleInfo saleInfo = new SaleInfo();
        String salt = RandomUtil.getRandom(24);
        ByteSource byteSource = ByteSource.Util.bytes(salt);
        String password = new SimpleHash("MD5","",byteSource,1024).toHex();

        return null;
    }
}
