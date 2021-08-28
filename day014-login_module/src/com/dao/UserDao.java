package com.dao;

import com.Utils.JDBCUtils;
import com.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * User的Dao层
 */
public class UserDao {
    /**
     * 声明JdbcTemplate对象共用
     */
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录功能
     * @param loginUser 只有用户名和密码
     * @return user包含用户所有数据
     */
    public User login(User loginUser){
        //1.编写sql
        String sql = "select * from user where username = ? and password = ?";

        //2.使用query方法
        try {
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUserName(), loginUser.getPassWord());
            return user;
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}
