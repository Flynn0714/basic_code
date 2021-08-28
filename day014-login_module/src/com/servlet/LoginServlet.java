package com.servlet;

import com.dao.UserDao;
import com.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1、设置编码
         */
        req.setCharacterEncoding("utf-8");

//        /**
//         * 2、获取请求参数
//         */
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        /**
//         * 3、封装user对象
//         */
//        User LoginUser = new User();
//        LoginUser.setUserName(username);
//        LoginUser.setPassWord(password);

        //2、使用BeanUtils接收对象参数，传入很多参数时，就不用一个一个接收了
        //接收所有参数
        Map<String,String[]> map = req.getParameterMap();
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + ":" + map.get(string));
        }
        //3、创建User对象
        User LoginUser = new User();
        System.out.println(LoginUser);

        //使用BeanUtils封装
        try {
            BeanUtils.populate(LoginUser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(LoginUser);
        /**
         * 4、调用UserDao的login的方法
         */
        UserDao dao = new UserDao();
        User user = dao.login(LoginUser);

        /**
         * 判断是否登陆成功
         */
        if (user == null) {
            //登录失败，跳转登录失败页面  使用页面跳转
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else {
            //登录成功，条状登入成功页面  使用数据共享
            req.setAttribute("user",user);
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }
    }
}
