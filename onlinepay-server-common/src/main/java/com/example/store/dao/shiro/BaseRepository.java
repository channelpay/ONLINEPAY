package com.example.store.dao.shiro;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
/**
 * 数据访问层base
 * @author 26500
 *
 * @param <T>
 * @param <I>
 */
@NoRepositoryBean
public interface BaseRepository<T,I extends Serializable> extends PagingAndSortingRepository<T, I>,JpaSpecificationExecutor<T> {

}
