package ffl.com.java;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/demo4")
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取字符流 只能操作字符数据
        BufferedReader reader = req.getReader();
        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("=====================");
        //获取字节流数据
        ServletInputStream inputStream = req.getInputStream();
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取所有请求头
        System.out.println(req.getAttribute("msg")+"访问了demo4..........");
        Enumeration<String> headerNames = req.getHeaderNames();
//        System.out.println(headerNames);
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            //获取请求头对应的值
            System.out.println(name+":" + req.getHeader(name));
        }

        System.out.println("Referer:" + req.getHeader("referer"));

        if (req.getHeader("user-agent").contains("Chrome")){
            System.out.println("谷歌来了！");
        }

    }
}
