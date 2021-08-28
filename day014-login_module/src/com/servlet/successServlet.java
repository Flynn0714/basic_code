package com.servlet;

import com.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据域数据共享
        User user = (User) req.getAttribute("user");

        //设置编码
        resp.setContentType("text/html;charset=utf-8");

        if (user != null) {
            //页面输出
            resp.getWriter().write("登陆成功，欢迎" + user.getUserName() + "!");
        }
    }
}
