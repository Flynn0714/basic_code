package com.test;



import com.dao.UserDao;
import com.domain.User;
import org.junit.Test;


public class UserDaoTest {

    @Test
    public void testLogin(){
        User loginUser = new User();
        loginUser.setUserName("supper");
        loginUser.setPassWord("12345");

        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);
        System.out.println(user);
    }
}
