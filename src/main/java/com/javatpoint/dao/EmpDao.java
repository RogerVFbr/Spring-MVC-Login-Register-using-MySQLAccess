package com.javatpoint.dao;

import com.javatpoint.beans.Emp;
import com.javatpoint.config.DBConfig;
import com.mysqlaccess.MySQLAccess;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class EmpDao {

    JdbcTemplate template;
    MySQLAccess table = new MySQLAccess(DBConfig.LOCAL, "emp99");

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public Object save(Emp p) {
        return table.add(p);
    }

    public int update(Emp p) {
        return table.update(p);
    }

    public int delete(int id) {
        return table.delete("id=" + id);
    }

    public Emp getEmpById(int id) {
        return table.get(Emp.class, "id=" + id).get(0);
    }

    public List<Emp> getEmployees() {
        return table.get(Emp.class);
    }
}  