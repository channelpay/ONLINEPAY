package com.example.store.service.agent;

import org.springframework.stereotype.Service;
import com.example.store.model.agent.AgentParam;
import com.example.store.service.base.BaseService;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * 登录服务控制类
 * 
 * @author ONEC
 *
 */
@Service
public class AgentLoginServiceImpl extends BaseService implements IAgentLoginService {

    /**
     * 登录查询交给shiro 处理
     */
    @Override
    public AgentParam findUserName(String agentEmail) {
        return agentParamMapper.selectByEmail(agentEmail);
    }

    @Override
    public void addAgentParam(Map<String, String> agentParam) {

    }

}
