package com.example.store.service.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;

/**
 * 配置过滤器
 * 
 * @author ONEC
 *
 */
@Component
public class SimpleFilter implements Filter {

    @Override
    public void destroy() {

    }

    /**
     * 表示将请求发送到控制器之前从serverlet request 中获取数据
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("拦截器获取到的ip    host：" + request.getRemoteHost());
        System.out.println("拦截器获取到的ip address：" + request.getRemoteAddr());
        filterChain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
