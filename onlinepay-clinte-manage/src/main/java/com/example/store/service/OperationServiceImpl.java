package com.example.store.service;

import com.example.store.model.manage.UserInfo;
import com.example.store.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationServiceImpl extends BaseService implements  OperationService{

    @Override
    public List<UserInfo> findAllOperation() {
        return  userInfoMapper.selectAllUser();
    }

    @Override
    public boolean updateOperation(UserInfo userInfo) {
        if(1==userInfoMapper.updateByPrimaryKey(userInfo)){
            return true;
        }
        return false;
    }
}
