package com.codeforfood.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RegistrationController
 */
@Controller
public class RegistrationController {

    @RequestMapping("/registration")
    public String regisration(Model model){
        model.addAttribute("button",true);
        return "index";
    }
}
