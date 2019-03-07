package com.example.store.config.redisutil;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * util 类 集成redis
 * 
 * @author ONEC
 *
 */
@EnableCaching
@Configuration
public class RedisTemplateUtil extends CachingConfigurerSupport {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.password}")
    private String password;
    @Value("${spring.redis.pool.timeout}")
    private int timeout;
    @Value("${spring.redis.pool.maxidle}")
    private int maxIdle;
    @Value("${spring.redis.pool.maxTotal}")
    private Integer maxTotal;
    @Value("${spring.redis.pool.maxwait}")
    private long maxWaitMillis;

    @Bean
    public JedisPool redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        jedisPoolConfig.setMaxTotal(maxTotal);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
        logger.info("redis数据链接配置完毕-------------------:" + LocalDate.now());
        return jedisPool;
    }

    @Bean
    public Jedis getJedis() {
        return this.redisPoolFactory().getResource();
    }

}
