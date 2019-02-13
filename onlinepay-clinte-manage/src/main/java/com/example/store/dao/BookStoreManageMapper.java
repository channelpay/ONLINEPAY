package com.example.store.dao;

import java.util.Map;
import com.example.store.model.BookStoreManage;

public interface BookStoreManageMapper {

    int deleteByPrimaryKey(Long bookManageId);

    int insert(BookStoreManage record);

    int insertSelective(BookStoreManage record);

    BookStoreManage selectByPrimaryKey(Long bookManageId);

    /**
     * 
     * @param bookManagePhone
     * @param bookManagePassword
     * @return BookStoreManage
     */
    BookStoreManage selectByManagePhonePassword(Map<String, String> loginMap);

    int updateByPrimaryKeySelective(BookStoreManage record);

    int updateByPrimaryKey(BookStoreManage record);
}
