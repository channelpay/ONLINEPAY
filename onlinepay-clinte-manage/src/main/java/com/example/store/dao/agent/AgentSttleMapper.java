package com.example.store.dao.agent;

import com.example.store.model.agent.AgentSttle;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentSttleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(AgentSttle record);

    int insertSelective(AgentSttle record);

    AgentSttle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentSttle record);

    int updateByPrimaryKey(AgentSttle record);
}