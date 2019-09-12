package com.javatpoint.dao;

import com.javatpoint.beans.User;
import com.javatpoint.config.DBConfig;
import com.mysqlaccess.MySQLAccess;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    JdbcTemplate template;
    MySQLAccess table = new MySQLAccess(DBConfig.LOCAL, "users");

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public Object save(User p) {
        return table.add(p);
    }

    public int update(User p) {
        return table.update(p);
    }

    public int delete(int id) {
        return table.delete("id=" + id);
    }

    public User getUserById(int id) {
        return table.get(User.class, "id=" + id).get(0);
    }

    public List<User> getUsers() {
        return table.get(User.class);
    }
}
