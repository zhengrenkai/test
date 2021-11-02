package com.baidu.settings.web.controller;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @authar zheng
 * @create 2021-11-02-21:57
 */
public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servlicePath = request.getServletPath();
        System.out.println(servlicePath);
        if("/settings/user/xx.do".equals(servlicePath)){
            System.out.println("操作");
        }else if("/settings/user/xx1.do".equals(servlicePath)){
            System.out.println("操作2");
        }
    }
}
