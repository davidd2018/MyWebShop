package com.example.WebShop.controllers;
//
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controllers {

    @GetMapping({"","/"})
    public String home(){
        return "index";
    }

    @GetMapping("/contacts")
    public String contact(){
        return "contact";
    }
}
