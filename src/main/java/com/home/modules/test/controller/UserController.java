package com.home.modules.test.controller;

import com.home.modules.test.dao.UserDao;
import com.home.modules.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String getByEmail(String email) {
        String userId;
        User user = userDao.findByEmail(email);
        if (user != null) {
            userId = String.valueOf(user.getId());
            return "The user id is: " + userId;
        }
        return "user " + email + " is not exist.";
    }


    @RequestMapping("/test")
    public List<String> test(){
        ModelAndView model = new ModelAndView("test.jsp");
        String sql = "SELECT id,test  FROM t_test where id = '1'";
        return (List<String>) jdbcTemplate.query(sql, new RowMapper<String>(){
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                String stu = rs.getString("test");
                return stu;
            }
        });
    }


}
