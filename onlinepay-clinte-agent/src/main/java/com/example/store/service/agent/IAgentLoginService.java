package com.example.store.service.agent;

import com.example.store.model.agent.AgentParam;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * 代理商登录业务处理
 * 
 * @author ONEC
 *
 */
public interface IAgentLoginService {

    AgentParam findUserName(String username);
    
    void addAgentParam(Map<String, String> agentParam);
}
