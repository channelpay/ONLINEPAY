package com.example.store.service.agent;

import java.util.Map;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;
import com.example.store.model.agent.AgentInfo;
import com.example.store.model.agent.AgentParam;
import com.example.store.model.agent.AgentSttle;
import com.example.store.service.base.BaseService;
import com.example.store.util.random.RandomUtil;

/**
 * 代理商登录/注册服务控制类
 * 
 * @author ONEC
 *
 */
@Service
public class AgentLoginServiceImpl extends BaseService implements IAgentLoginService {


    /**
     * 登录查询交给shiro 处理
     */
    @Override
    public AgentParam findUserName(String agentEmail) {
        return agentParamMapper.selectByEmail(agentEmail);
    }

    /**
     * 添加代理辅助信息
     */
    @Override
    public String addAgentParam(Map<String, String> regirstParam) {
        // 生成代理商信息
        AgentInfo agentInfo = new AgentInfo();
        agentInfo.setAgentAddress(null);
        agentInfoMapper.insert(agentInfo);
        // 生成param 数据
        AgentParam agentParam = new AgentParam();
        // 生成salt 唯一颜值
        String salt = RandomUtil.getRandom(24);
        ByteSource byteSource = ByteSource.Util.bytes(salt);

        agentParam.setAgDeskey(salt);
        // shiro 生成密码：必须符合配置shiro的规则
        String agPassword =
                new SimpleHash("MD5", agentParam.getAgPassword(), byteSource, 1024).toHex();
        agentParam.setAgPassword(agPassword);
        agentParamMapper.insert(agentParam);

        // 生成代理结算信息
        AgentSttle agentSttle = new AgentSttle();
        agentSttle.setAgentid(agentInfo.getId());
        agentSttleMapper.insert(agentSttle);
        return agPassword;
    }

}
