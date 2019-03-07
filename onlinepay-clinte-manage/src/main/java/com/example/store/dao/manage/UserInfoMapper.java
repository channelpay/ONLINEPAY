package com.example.store.dao.manage;

import com.example.store.model.manage.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectAllUser();

    UserInfo selectByPrimaryKey(Integer id);

    UserInfo selectByUserName(String userName);

    UserInfo selectByUserEmail(String userEmail);

    UserInfo selectByUserPhone(String userPhone);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}