package com.example.backend.main.controller.interceptor;


import com.example.backend.main.util.HostHolder;
import com.mysql.cj.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginTicketInterceptor implements HandlerInterceptor {

    @Resource
    private HostHolder hostHolder;

    private Logger logger = LoggerFactory.getLogger(LoginTicketInterceptor.class);

    /**
     * intercept before login
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;

    }


    private static boolean responseOptionsRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Headers", "ticket,Origin,Content-Type,Accept,token,X-Requested-With");
        if (request.getMethod().equals(HttpMethod.OPTIONS.toString())) {
            response.setStatus(HttpStatus.OK.value());
            response.getWriter().write("OPTIONS returns OK");
            return true;
        } else {
            return false;
        }
    }
}


