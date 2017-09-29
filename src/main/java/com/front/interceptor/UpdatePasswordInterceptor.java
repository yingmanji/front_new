package com.front.interceptor;

import com.front.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 樱满集0_0 on 2017/9/20.
 */
public class UpdatePasswordInterceptor implements HandlerInterceptor{

    @Autowired
    private AdminService adminService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        String adminPassword=(String) request.getSession().getAttribute("adminPassword");
        String oldAdminPassword=request.getParameter("adminOldPassword");

        if(adminPassword!=null && oldAdminPassword!=null && oldAdminPassword.equals(adminPassword)){

            return true;
        }

        request.getRequestDispatcher("login").forward(request,response);

        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
