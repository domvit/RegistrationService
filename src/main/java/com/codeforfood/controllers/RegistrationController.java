package com.codeforfood.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RegistrationController
 */
@Controller
public class RegistrationController {

    private final static Logger LOGGER = Logger.getLogger(RegistrationController.class);

    @RequestMapping("/registration")
    public String registration(Model model){
        model.addAttribute("button", true);
        LOGGER.info("Returned main view");
        return "index";
    }
}
