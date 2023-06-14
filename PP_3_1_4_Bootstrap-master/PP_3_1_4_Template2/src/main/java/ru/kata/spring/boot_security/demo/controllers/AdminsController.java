package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.services.UsersService;



@Controller
public class AdminsController {

    private final UsersService usersService;



    @Autowired
    public AdminsController(UsersService usersService) {

        this.usersService = usersService;
    }

    @GetMapping("/admin")
    public String showAllUsers(Model model) {
        model.addAttribute("user", usersService.findOne());

        return "admin";
    }


}
