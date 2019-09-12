package com.loginregisterspringmvc.controllers;

import com.loginregisterspringmvc.models.User;
import com.loginregisterspringmvc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    UserDao dao;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(Model m) {
        m.addAttribute("command", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkCredentials (@ModelAttribute("user") User user, Model m) {
        String email = user.getEmail();
        String password = user.getPassword();
        User dbUser = dao.getUserByEmail(email);
        if (dbUser!=null && password.equals(dbUser.getPassword())) return "loginsuccess";
        dbUser.setPassword("");
        m.addAttribute("command", dbUser);
        m.addAttribute("error", "Invalid credentials.");
        return "login";
    }
}
