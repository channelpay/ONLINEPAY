// package com.example.store.config.mvcutil;
//
// import org.springframework.util.ResourceUtils;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
// @SuppressWarnings("deprecation")
// public class MvcConfigUtils extends WebMvcConfigurerAdapter {
//
// /**
// * 需要重写这个方法
// */
// @Override
// public void addResourceHandlers(ResourceHandlerRegistry registry) {
// // 将所有/static/** 访问都映射到classpath:/static/ 目录下
// registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
// // 映射模板文件
// registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
// // 这种配置就明确了其所在
// registry.addResourceHandler("/image/**")
// .addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/image/");
//
// super.addResourceHandlers(registry);
// }
// }
