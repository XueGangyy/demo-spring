package com.example.demo.controller;

import com.example.demo.config.WebMvcConfig;
import com.example.demo.interceptor.SecurityInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by yuyue on 2017/11/30.
 */
@Controller
@CrossOrigin
public class LoginSessionController {

    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login/user",method = RequestMethod.POST)
    @ResponseBody
    public String loginUser(@RequestBody Map<String,String> map,HttpServletRequest request){
//        ModelAndView mav=new ModelAndView();
        HttpSession session=request.getSession();
        String userName=map.get("username");
        String password=map.get("password");
        session.setAttribute(SecurityInterceptor.SESSION_KEY,userName);
//        session.setAttribute("password",password);
        System.out.println("用户名："+userName+"密码："+password);
        System.out.println("session中的用户名："+
                session.getAttribute(SecurityInterceptor.SESSION_KEY));
        if(userName.equals("yuyue")&&password.equals("123456"))
            return "success";
        return "error";
    }

    @RequestMapping("/index")
    public ModelAndView index(HttpSession session){
        ModelAndView mav=new ModelAndView();
        System.out.println("session中的用户名:"+session.getAttribute(SecurityInterceptor.SESSION_KEY));
        mav.setViewName("index/index");
        return mav;
    }

}
