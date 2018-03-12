package com.example.demo4.controller;

import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService us;

    @RequestMapping("/")
    public  String query(Model model){
        model.addAttribute("users",us.findAll());
        return "home";
    }
}
