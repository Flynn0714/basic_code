package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RespServlet01")
public class RespServlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 设置编码
         */
        System.out.println("This is Python!");
        /**
         *   重定向
         */
        // 1、设置状态码 重定向302 使用浏览器缓存304
        response.setStatus(302);
        // 2、设置响应头location
        response.setHeader("location","/day15/RespServlet02");

        /**
         * 简单的代码实现重定向
         */
        response.sendRedirect("/day15/RespServlet02");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
