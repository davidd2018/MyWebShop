package com.example.WebShop.controllers;

import org.springframework.ui.Model;
import com.example.WebShop.models.RegisterDto;
import com.example.WebShop.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @Autowired
    private ClientRepository repo;

    @GetMapping("/register")
    public String register(Model model){
        RegisterDto registerDto = new RegisterDto();
        model.addAttribute(registerDto);

        return "register";
    }
}

