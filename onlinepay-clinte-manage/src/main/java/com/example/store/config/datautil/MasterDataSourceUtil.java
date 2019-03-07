package com.example.store.config.datautil;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 精确到主数据源的配置，以便和其他数据源分开
     */
    protected static final String MASTER_DATA_PACKAGE = "com.example.store.dao";
    private static final String MASTER_DATA_MAPPER = "classpath:mapper/**/*.xml";

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
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(jdbcUrl);
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
        logger.info("master:connect()","主数据源加载成功：");
        return sessionFactory.getObject();
    }
}
