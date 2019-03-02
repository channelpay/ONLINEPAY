package com.example.store.service.channel.base;

import com.example.store.model.merchant.MerchantParam;
import com.example.store.model.order.OnlineOrderParam;
import com.example.store.service.channel.base.OnlineChannelBase;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public abstract class  OnlineChannelBaseDefault implements OnlineChannelBase{

    @Override
    public boolean needRegister() {
        return false;
    }

    @Override
    public Map<String, String> registerMerchantApi(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> openProductApi(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> updateMerchantFee(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> updateMerchantSettle(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> requestOrder(OnlineOrderParam onlineOrderParam) {
        return null;
    }

    @Override
    public Map<String, String> requestOrderAlipay(OnlineOrderParam onlineOrderParam) {
        return null;
    }

    @Override
    public Map<String, String> requestOrderUnionPay(OnlineOrderParam onlineOrderParam) {
        return null;
    }

    @Override
    public Map<String, String> requestOrderQuickPay(OnlineOrderParam onlineOrderParam) {
        return null;
    }

    @Override
    public Map<String, String> notifyMerchantApi(HttpServletRequest request) {
        return null;
    }

    @Override
    public Map<String, String> notifyOpenCardApi(HttpServletRequest request) {
        return null;
    }

    @Override
    public Map<String, String> notifyOnlineOrderApi(HttpServletRequest request) {
        return null;
    }

    @Override
    public Map<String, String> notifySettleApi(HttpServletRequest request) {
        return null;
    }

    @Override
    public Map<String, String> queryMerchantApi(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> queryMerchantAmountApi(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> queryOpenCardApi(MerchantParam merchantParam) {
        return null;
    }

    @Override
    public Map<String, String> queryOnlineOrderApi(OnlineOrderParam onlineOrderParam) {
        return null;
    }

    @Override
    public Map<String, String> querySettleApi(OnlineOrderParam onlineOrderParam) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
