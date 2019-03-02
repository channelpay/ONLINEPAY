package com.example.store.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.store.dao.agent.AgentInfoMapper;
import com.example.store.dao.agent.AgentParamMapper;
import com.example.store.dao.agent.AgentSttleMapper;

/**
 * 服务控制类
 * 
 * @author ONEC
 *
 */
@Service
public class BaseService {

    @Autowired
    protected AgentInfoMapper agentInfoMapper;
    @Autowired
    protected AgentParamMapper agentParamMapper;
    @Autowired
    protected AgentSttleMapper agentSttleMapper;
}
