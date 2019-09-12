package com.javatpoint.dao;

import com.javatpoint.beans.Product;
import com.javatpoint.config.DBConfig;
import com.mysqlaccess.MySQLAccess;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProductDao {
    JdbcTemplate template;
    MySQLAccess table = new MySQLAccess(DBConfig.LOCAL, "products");

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public Object save(Product p) {
        return table.add(p);
    }

    public int update(Product p) {
        return table.update(p);
    }

    public int delete(int id) {
        return table.delete("id=" + id);
    }

    public Product getProductById(int id) {
        return table.get(Product.class, "id=" + id).get(0);
    }

    public List<Product> getProducts() {
        return table.get(Product.class);
    }
}
