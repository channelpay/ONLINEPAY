package com.example.store.service;

import com.example.store.model.manage.UserInfo;

import java.util.List;

public interface OperationService {

    List<UserInfo> findAllOperation();

    boolean updateOperation(UserInfo userInfo);
}
