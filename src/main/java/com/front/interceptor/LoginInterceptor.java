package com.front.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 樱满集0_0 on 2017/9/20.
 */
public class LoginInterceptor implements HandlerInterceptor{

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        String url=request.getRequestURI();
        System.out.println("1111:"+url);
        if(url.indexOf("/loginAdmin")>=0 ){
            System.out.println("222");
            return true;
        }

        String username=(String)request.getSession().getAttribute("adminName");

        if(username!=null)
        {
            System.out.println("333");
            return true;
        }

        request.getRequestDispatcher(request.getContextPath()+"/views/index.html").forward(request,response);

        /*System.out.println("444");*/
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
