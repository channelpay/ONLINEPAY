package com.example.store.service.agent;

import java.util.Map;
import com.example.store.model.agent.AgentParam;

/**
 * 代理商登录业务处理
 * 
 * @author ONEC
 *
 */
public interface IAgentLoginService {

    AgentParam findUserName(String username);

    String addAgentParam(Map<String, String> agentParam);
}
