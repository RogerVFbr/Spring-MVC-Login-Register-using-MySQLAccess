package com.loginregisterspringmvc.dao;

import com.loginregisterspringmvc.models.User;
import com.loginregisterspringmvc.config.DBConfig;
import com.mysqlaccess.MySQLAccess;

import java.util.List;

public class UserDao {

    MySQLAccess table = new MySQLAccess(DBConfig.getConfig(), "users");;

    static {
        MySQLAccess.logDetails();
        MySQLAccess.logInfo();
    }

    public Object add(User p) {
        return table.add(p);
    }

    public User getUserByEmail(String email) {
        List<User> user = table.get(User.class, "email='" + email + "'");
        if (user.size()>0) return user.get(0);
        return null;
    }
}
