package com.example.store.dao.agent;

import com.example.store.model.agent.PayAgentSttle;

public interface PayAgentSttleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayAgentSttle record);

    int insertSelective(PayAgentSttle record);

    PayAgentSttle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayAgentSttle record);

    int updateByPrimaryKey(PayAgentSttle record);
}