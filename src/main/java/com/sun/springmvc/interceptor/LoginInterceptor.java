package com.sun.springmvc.interceptor;

import com.sun.springmvc.bean.UserSessionBean;
import com.sun.springmvc.context.SessionContext;
import com.sun.springmvc.controller.OrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    SessionContext<UserSessionBean> sessionContext;
    /**
     * 预处理：在拦截方法前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserSessionBean userSessionBean = new UserSessionBean();
        userSessionBean.setName("userSession");
        userSessionBean.setRoleName("admin");
        sessionContext.set(userSessionBean);
        System.out.println("interceptor  -- preHandle");
        return true;
    }

    /**
     * 后处理：在拦截方法后执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("interceptor  -- postHandle");
    }

    /**
     * 渲染后处理：在页面渲染后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("interceptor  -- afterCompletion");
    }
}
