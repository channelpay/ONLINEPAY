package com.example.store.dao.agent;

import com.example.store.model.agent.PayAgentParam;

public interface PayAgentParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayAgentParam record);

    int insertSelective(PayAgentParam record);

    PayAgentParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayAgentParam record);

    int updateByPrimaryKey(PayAgentParam record);
}