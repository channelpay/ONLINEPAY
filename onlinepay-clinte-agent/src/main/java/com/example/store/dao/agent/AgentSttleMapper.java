package com.example.store.dao.agent;

import com.example.store.model.agent.AgentSttle;

public interface AgentSttleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentSttle record);

    int insertSelective(AgentSttle record);

    AgentSttle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentSttle record);

    int updateByPrimaryKey(AgentSttle record);
}