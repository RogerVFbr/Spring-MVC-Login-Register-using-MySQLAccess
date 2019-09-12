package com.javatpoint.dao;

import com.javatpoint.beans.Order;
import com.javatpoint.config.DBConfig;
import com.mysqlaccess.MySQLAccess;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrderDao {

    JdbcTemplate template;
    MySQLAccess table = new MySQLAccess(DBConfig.LOCAL, "orders");

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public Object save(Order p) {
        return table.add(p);
    }

    public int update(Order p) {
        return table.update(p);
    }

    public int delete(int id) {
        return table.delete("id=" + id);
    }

    public Order getOrderById(int id) {
        return table.get(Order.class, "id=" + id).get(0);
    }

    public List<Order> getOrders() {
        return table.get(Order.class);
    }
}
