package com.example.store.service.channel.base;

import com.example.store.model.merchant.MerchantParam;
import com.example.store.model.order.OnlineOrderParam;
import org.springframework.beans.factory.InitializingBean;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 通道方法设计
 */
public interface OnlineChannelBase extends InitializingBean {

    /*************************商户部分******************************/
    /**
     * 通道是否需要保单
     *
     */
    public boolean  needRegister();

    /**
     * 通道商户注册通用
     *
     */
    public Map<String,String> registerMerchantApi(MerchantParam merchantParam);

    /**
     * 通道商户产品开通通用
     *
     */
    public Map<String,String> openProductApi(MerchantParam merchantParam);

    /**
     * 通道商户费率修改/添加通用
     *
     */
    public Map<String,String> updateMerchantFee(MerchantParam merchantParam);

    /**
     * 通道商户结算修改/添加通用
     *
     */
    public Map<String,String> updateMerchantSettle(MerchantParam merchantParam);

    /*************************交易部分******************************/

    /**
     * 微信交易通用类
     * @param onlineOrderParam
     * @return
     */
    public Map<String,String> requestOrder(OnlineOrderParam onlineOrderParam);

    /**
     * 支付宝交易通用类
     * @param onlineOrderParam
     * @return
     */
    public Map<String,String> requestOrderAlipay(OnlineOrderParam onlineOrderParam);

    /**
     * 银联二维码交易通用类
     * @param onlineOrderParam
     * @return
     */
    public Map<String,String> requestOrderUnionPay(OnlineOrderParam onlineOrderParam);

    /**
     *  快捷支付交易通用类
     * @param onlineOrderParam
     * @return
     */
    public Map<String,String> requestOrderQuickPay(OnlineOrderParam onlineOrderParam);

    /*************************通知部分******************************/

    /**
     * 商户注册异步通知
     * @param request
     * @return
     */
    public Map<String,String> notifyMerchantApi(HttpServletRequest request);

    /**
     * 绑卡异步通知
     * @param request
     * @return
     */
    public Map<String,String> notifyOpenCardApi(HttpServletRequest request);

    /**
     * 交易异步通知
     * @param request
     * @return
     */
    public Map<String,String> notifyOnlineOrderApi(HttpServletRequest request);

    /**
     * 商户结算异步通知
     * @param request
     * @return
     */
    public Map<String,String> notifySettleApi(HttpServletRequest request);

    /*************************查询部分******************************/

    /**
     * 商户注册信息查询
     * @param request
     * @return
     */
    public Map<String,String> queryMerchantApi(MerchantParam merchantParam);

    /**
     * 商户账户信息查询
     * @return
     */
    public Map<String,String> queryMerchantAmountApi(MerchantParam merchantParam);

    /**
     * 商户绑卡信息查询
     * @param request
     * @return
     */
    public Map<String,String> queryOpenCardApi(MerchantParam merchantParam);

    /**
     * 订单信息查询
     * @param request
     * @return
     */
    public Map<String,String> queryOnlineOrderApi(OnlineOrderParam onlineOrderParam);

    /**
     * 结算信息查询
     * @param request
     * @return
     */
    public Map<String,String> querySettleApi(OnlineOrderParam onlineOrderParam);

}
