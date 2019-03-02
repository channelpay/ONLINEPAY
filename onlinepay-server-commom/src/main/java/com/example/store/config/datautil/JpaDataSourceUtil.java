//package com.example.store.config.datautil;
//
//import java.util.Properties;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.init.DataSourceInitializer;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//
///**
// * 自定义jpa 数据源
// *
// * @author 26500
// *
// */
//@Configuration
//@EnableJpaRepositories(basePackages = "com.example.store",
//        entityManagerFactoryRef = "jpaEntityManagerFactory",
//        transactionManagerRef = "jpaTransactionManager")
//public class JpaDataSourceUtil {
//
//    @Autowired
//    private Environment env; // 1
//
//    @Bean
//    @ConfigurationProperties(prefix = "datasource.jpa")
//    public DataSourceProperties jpaDataSourceProperties() { // 2
//        return new DataSourceProperties();
//    }
//
//
//    @Bean
//    @Qualifier(value = "jpaDataSource")  //spring装配bean的唯一标识
//    public DataSource jpaDataSource() { // 3
//        DataSourceProperties jpaDataSourceProperties = jpaDataSourceProperties();
//        System.out.println("加载数据连接文件：" + jpaDataSourceProperties.getUrl());
//        return DataSourceBuilder.create()
//                .driverClassName(jpaDataSourceProperties.getDriverClassName())
//                .url(jpaDataSourceProperties.getUrl())
//                .username(jpaDataSourceProperties.getUsername())
//                .password(jpaDataSourceProperties.getPassword()).build();
//    }
//
//    @Bean
//    public PlatformTransactionManager jpaTransactionManager() { // 4
//        EntityManagerFactory factory = jpaEntityManagerFactory().getObject();
//        return new JpaTransactionManager(factory);
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean jpaEntityManagerFactory() {// 5
//        LocalContainerEntityManagerFactoryBean factory =
//                new LocalContainerEntityManagerFactoryBean();
//        factory.setDataSource(jpaDataSource());
//        factory.setPackagesToScan("com.example.store");
//        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        Properties jpaProperties = new Properties();
//        jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//        jpaProperties.put("hibernate.show-sql", env.getProperty("hibernate.show-sql"));
//        jpaProperties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
//        factory.setJpaProperties(jpaProperties);
//        return factory;
//    }
//
//    @Bean
//    public DataSourceInitializer jpaDataSourceInitializer() {// 6
//        DataSourceInitializer dsInitializer = new DataSourceInitializer();
//        dsInitializer.setDataSource(jpaDataSource());
//        ResourceDatabasePopulator dbPopulator = new ResourceDatabasePopulator();
//        dbPopulator.addScript(new ClassPathResource("security-data.sql"));
//        dsInitializer.setDatabasePopulator(dbPopulator);
//        dsInitializer
//                .setEnabled(env.getProperty("datasource.man.initialize", Boolean.class, false));
//        return dsInitializer;
//    }
//}
