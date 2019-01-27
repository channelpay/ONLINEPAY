package com.example.store.service.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 配置产品拦截器
 * 
 * @author ONEC
 *
 */
public class ProductServiceInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {}

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception exception) throws Exception {}
    
    
   //必须 WebMvcConfigurerAdapter向InterceptorRegistry注册此Interceptor
    // @Component
    // public class ProductServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
    // @Autowired
    // ProductServiceInterceptor productServiceInterceptor;
    //
    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    // registry.addInterceptor(productServiceInterceptor);
    // }
    // }
}
