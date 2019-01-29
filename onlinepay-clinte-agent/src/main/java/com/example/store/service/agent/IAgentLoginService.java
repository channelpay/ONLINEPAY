package com.example.store.service.agent;

import com.example.store.model.agent.AgentParam;

/**
 * 代理商登录业务处理
 * 
 * @author ONEC
 *
 */
public interface IAgentLoginService {

    AgentParam findUserName(String username);
}
