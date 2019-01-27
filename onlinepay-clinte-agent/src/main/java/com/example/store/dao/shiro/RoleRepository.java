package com.example.store.dao.shiro;

import org.springframework.stereotype.Repository;
import com.example.store.model.shiro.Role;

/**
 * 角色数据持久化
 * 
 * @author 26500
 *
 */
@Repository
public interface RoleRepository extends BaseRepository<Role, Long> {

}
