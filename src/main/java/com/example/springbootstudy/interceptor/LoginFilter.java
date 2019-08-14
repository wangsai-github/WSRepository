package com.example.springbootstudy.interceptor;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title:LoginFilter
 * @Description:登陆拦截器
 * @author: wangsai
 * @date 2019/8/12 10:45
 */
//@Component
@WebFilter(filterName = "loginFilter",urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("------------过滤器被创建-------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String requestURI = httpServletRequest.getRequestURI();
        System.out.println("-----------过滤器请求地址------"+requestURI);
        /**
         * 放行登录时的请求路径的同时也需要放行登录成功后请求时的接口路径
         */
        if(requestURI.contains("/StudentInfo/getStudentInfo")||requestURI.contains("/StudentInfoCon/login")){
            //放行此路径下的请求
            filterChain.doFilter(httpServletRequest,httpServletResponse);
        }else{
               //如果有需要可以在此处设置Session，获取对象是否为空来控制页面跳转路径
            System.out.println("--------重定向-----------");
            httpServletResponse.sendRedirect("/StudentInfoCon/login");
        }
    }

    @Override
    public void destroy() {
        System.out.println("-----------过滤器被销毁-----------");
    }
}