package com.example.springbootstudy.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title:FilterConfig
 * @Description:拦截器注册
 * @author: wangsai
 * @date 2019/8/12 10:14
 */

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //重在传入的参数
        registration.setFilter(new LoginFilter());
        //拦截路径
        registration.addUrlPatterns("/*");
        //拦截器名称
        registration.setName("loginFilter");
        //拦截顺序
        registration.setOrder(1);
        return registration;
    }
}