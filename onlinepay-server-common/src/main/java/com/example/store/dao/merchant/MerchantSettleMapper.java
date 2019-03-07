package com.example.store.dao.merchant;

import com.example.store.model.merchant.MerchantSettle;

public interface MerchantSettleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantSettle record);

    int insertSelective(MerchantSettle record);

    MerchantSettle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantSettle record);

    int updateByPrimaryKey(MerchantSettle record);
}