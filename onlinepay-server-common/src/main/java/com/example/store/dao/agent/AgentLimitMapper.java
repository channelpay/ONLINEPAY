package com.example.store.dao.agent;

import com.example.store.model.agent.AgentLimit;

public interface AgentLimitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentLimit record);

    int insertSelective(AgentLimit record);

    AgentLimit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentLimit record);

    int updateByPrimaryKey(AgentLimit record);
}