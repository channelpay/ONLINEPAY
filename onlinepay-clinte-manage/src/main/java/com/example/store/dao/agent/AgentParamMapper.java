package com.example.store.dao.agent;

import com.example.store.model.agent.AgentParam;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentParamMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(AgentParam record);

    int insertSelective(AgentParam record);

    AgentParam selectByPrimaryKey(Integer id);
    
    AgentParam selectByEmail(String agentEmail);

    int updateByPrimaryKeySelective(AgentParam record);

    int updateByPrimaryKey(AgentParam record);
}