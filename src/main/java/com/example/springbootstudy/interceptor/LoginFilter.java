package com.example.springbootstudy.interceptor;

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

//@WebFilter(filterName = "loginFilter",urlPatterns = "/**")
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
        if(requestURI.contains("/Login.html")||requestURI.contains("/StudentInfoCon/login")){
            filterChain.doFilter(httpServletRequest,httpServletResponse);
        }else{
//            Object object = httpServletRequest.getSession().getAttribute("");
//            if(object == null){
            System.out.println("--------重定向-----------");
                httpServletResponse.sendRedirect("/StudentInfoCon/login");
//                return;
//            }else {
//                filterChain.doFilter(httpServletRequest,httpServletResponse);
//            }
        }
    }

    @Override
    public void destroy() {
        System.out.println("-----------过滤器被销毁-----------");
    }
}