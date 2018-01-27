package com.example.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by yuyue on 2017/12/2.
 */
@Component
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    public static final String SESSION_KEY="uatyui";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
       System.out.println("进入验证");
        HttpSession session = request.getSession();
        System.out.println("拦截器中session的用户名："+
                session.getAttribute(SESSION_KEY));
        if (session.getAttribute(SESSION_KEY) != null) {
            return true;
        } else {
            String url = "/login";
            response.sendRedirect(url);
            return false;
        }
    }
}
