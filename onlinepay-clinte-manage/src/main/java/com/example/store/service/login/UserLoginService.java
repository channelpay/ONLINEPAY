package com.example.store.service.login;

import com.example.store.model.manage.UserInfo;
import com.example.store.model.request.RequestParam;

public interface UserLoginService {

    UserInfo findUserName(String username);

    UserInfo addSaleInfo(RequestParam requestParam);
}
