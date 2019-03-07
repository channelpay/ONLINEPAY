package com.example.store.dao.merchant;

import com.example.store.model.merchant.MerchantParam;

public interface MerchantParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantParam record);

    int insertSelective(MerchantParam record);

    MerchantParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantParam record);

    int updateByPrimaryKey(MerchantParam record);
}