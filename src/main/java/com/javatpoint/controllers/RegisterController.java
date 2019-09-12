package com.javatpoint.controllers;

import com.javatpoint.models.User;
import com.javatpoint.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @Autowired
    UserDao dao;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(Model m) {
        m.addAttribute("command", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String checkCredentials (@ModelAttribute("user") User user, Model m) {
        User dbUser = dao.getUserByEmail(user.getEmail());
        if (dbUser==null) {
            dao.add(user);
            m.addAttribute("command", user);
            return "login";
        }
        dbUser.setEmail("");
        m.addAttribute("command", dbUser);
        m.addAttribute("error", "E-mail address is already taken.");
        return "register";
    }
}
