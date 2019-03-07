package com.example.store.config.datautil;

import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @author ONEC springboot mybatis 第一数据源配置
 */
@Configuration
@MapperScan(basePackages = {MasterDataSourceUtil.MASTER_DATA_PACKAGE},
        sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceUtil {
    private static final Log logger = LogFactory.getLog(MasterDataSourceUtil.class);
    /**
     * 精确到主数据源的配置，以便和其他数据源分开
     */
    protected static final String MASTER_DATA_PACKAGE = "com.example.store.dao";
    private static final String MASTER_DATA_MAPPER = "classpath:mapper/*.xml";

    @Value("${spring.datasource.master.jdbcUrl}")
    private String jdbcUrl;

    @Value("${spring.datasource.master.driverClassName}")
    private String driverClass;

    @Value("${spring.datasource.master.username}")
    private String username;

    @Value("${spring.datasource.master.password}")
    private String password;

    /**
     * 数据源连接配置
     * 
     * @return
     */
    @Bean(name = "masterDataSource")
    @Primary
    public DataSource masterDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        logger.info("获取主数据库连接成功：" + jdbcUrl);
        return dataSource;
    }

    /**
     * 数据源事务管理
     * 
     * @return
     */
    @Bean(name = "masterDataSourceTransactionManager")
    @Primary
    public DataSourceTransactionManager masterDataSourceTransactionManager() {
        return new DataSourceTransactionManager(masterDataSource());
    }

    /**
     * 数据源配置成功
     * 
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "masterSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(
            @Qualifier("masterDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources(MASTER_DATA_MAPPER));
        return sessionFactory.getObject();
    }
}
