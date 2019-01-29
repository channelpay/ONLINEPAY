package com.example.store.dao.agent;

import com.example.store.model.agent.PayAgentInfo;

public interface PayAgentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayAgentInfo record);

    int insertSelective(PayAgentInfo record);

    PayAgentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayAgentInfo record);

    int updateByPrimaryKey(PayAgentInfo record);
}