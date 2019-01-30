package com.example.store.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.store.dao.agent.AgentParamMapper;

/**
 * 服务控制类
 * 
 * @author ONEC
 *
 */
@Service
public class BaseService {

    @Autowired
    protected AgentParamMapper agentParamMapper;
}
