package vn.topica.itlab4.findfinders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.topica.itlab4.findfinders.model.User;

@Controller
public class MappingController {

    @RequestMapping(value = "/homepage")
    public String homepage() {
        return "homepage";
    }

    @RequestMapping(value = "/get_to_login")
    public String getToLogin() {
        return "login";
    }

    @RequestMapping(value = "/get_to_register")
    public String getToRegister(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/get_to_profile")
    public String getToProfile() {
        return "profile";
    }
}
