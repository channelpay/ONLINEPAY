package com.example.store.dao.merchant;

import com.example.store.model.merchant.MerchantLimit;

public interface MerchantLimitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantLimit record);

    int insertSelective(MerchantLimit record);

    MerchantLimit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantLimit record);

    int updateByPrimaryKey(MerchantLimit record);
}