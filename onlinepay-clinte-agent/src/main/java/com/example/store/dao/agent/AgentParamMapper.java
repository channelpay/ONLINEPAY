package com.example.store.dao.agent;

import com.example.store.model.agent.AgentParam;

public interface AgentParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentParam record);

    int insertSelective(AgentParam record);

    AgentParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentParam record);

    int updateByPrimaryKey(AgentParam record);
}