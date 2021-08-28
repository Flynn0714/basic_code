package ffl.com.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo3")
public class Servletdemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet......");
        System.out.println("request对象：" + req);
        System.out.println("请求方法："+req.getMethod());
        System.out.println("虚拟目录：" + req.getContextPath());
        System.out.println("Servlet路径：" + req.getServletPath());
        System.out.println("get请求参数：" +req.getQueryString());
        System.out.println("URI：" + req.getRequestURI());
        System.out.println("URL：" + req.getRequestURL());
        System.out.println("协议版本：" + req.getProtocol());
        System.out.println("客户机IP地址：" + req.getRemoteAddr());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost......");
    }
}
