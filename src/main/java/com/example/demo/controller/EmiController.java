package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmiController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String calculate(Model model) {
        System.out.println("ok");
        return "calculate-form";
    }
}
