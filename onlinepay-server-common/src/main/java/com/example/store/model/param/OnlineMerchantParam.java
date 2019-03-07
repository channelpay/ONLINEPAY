package com.example.store.model.param;

import com.example.store.model.merchant.MerchantInfo;
import com.example.store.model.merchant.MerchantLimit;
import com.example.store.model.merchant.MerchantParam;
import com.example.store.model.merchant.MerchantSettle;

/**
 * 商户信息复合类
 */
public class OnlineMerchantParam {

    private MerchantInfo merchantInfo;

    private MerchantParam merchantParam;

    private MerchantSettle merchantSettle;

    private MerchantLimit merchantLimit;

    public OnlineMerchantParam() {

    }

    public OnlineMerchantParam(MerchantInfo merchantInfo,MerchantLimit merchantLimit) {
        this.merchantInfo = merchantInfo;
        this.merchantLimit = merchantLimit;
    }
}
