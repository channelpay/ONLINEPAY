package com.example.store.dao.agent;

import com.example.store.model.agent.AgentInfo;

public interface AgentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentInfo record);

    int insertSelective(AgentInfo record);

    AgentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentInfo record);

    int updateByPrimaryKey(AgentInfo record);
}