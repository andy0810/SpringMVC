package com.sun.springmvc.filter;

import javax.servlet.*;
import java.io.IOException;

public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter --- init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter --- doFilter ---Before Chain");
        chain.doFilter(request,response);
        System.out.println("filter --- doFilter ---After Chain");
    }

    @Override
    public void destroy() {
        System.out.println("filter --- destroy");
    }
}
