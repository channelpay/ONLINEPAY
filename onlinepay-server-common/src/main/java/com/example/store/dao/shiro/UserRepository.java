package com.example.store.dao.shiro;

import org.springframework.stereotype.Repository;
import com.example.store.model.shiro.User;

/**
 * 用户数据访问层
 * 
 * @author 26500
 *
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    /**
     * findByUsername 方法名写错的情况下 会报错（No property name found for type ×××）
     * @param username
     * @return
     */
    User findByUsername(String username);
}
