package com.lanou.springbootluyui.dao;

import com.lanou.springbootluyui.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.tree.RowMapper;
import java.util.List;
@Repository
public class UseDaoImpl implements UseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> queryAll() {
     List<User> user =   jdbcTemplate.query("select*from user",new BeanPropertyRowMapper<>(User.class));
       return user;

    }
}
