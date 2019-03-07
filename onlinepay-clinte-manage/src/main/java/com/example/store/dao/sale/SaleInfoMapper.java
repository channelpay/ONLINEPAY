package com.example.store.dao.sale;

import com.example.store.model.sale.SaleInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SaleInfo record);

    int insertSelective(SaleInfo record);

    SaleInfo selectByPrimaryKey(Integer id);

    SaleInfo selectByEmail(String email);

    SaleInfo selectByPhone(String phone);

    SaleInfo selectByUserName(String userName);

    int updateByPrimaryKeySelective(SaleInfo record);

    int updateByPrimaryKey(SaleInfo record);
}