package com.example.store.service.base;

import com.example.store.dao.manage.UserInfoMapper;
import com.example.store.dao.sale.SaleInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.store.dao.agent.AgentInfoMapper;
import com.example.store.dao.agent.AgentParamMapper;
import com.example.store.dao.agent.AgentSttleMapper;

/**
 * 服务控制类
 * 
 * @author ONEC
 *
 */
public class BaseService {

    @Autowired
    protected SaleInfoMapper saleInfoMapper;
    @Autowired
    protected AgentInfoMapper agentInfoMapper;
    @Autowired
    protected AgentParamMapper agentParamMapper;
    @Autowired
    protected AgentSttleMapper agentSttleMapper;
    @Autowired
    protected UserInfoMapper userInfoMapper;

}
