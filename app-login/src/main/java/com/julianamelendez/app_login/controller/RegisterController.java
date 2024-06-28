package com.julianamelendez.app_login.controller;

import com.julianamelendez.app_login.entity.User;
import com.julianamelendez.app_login.repository.BasicAuthRepository;
import com.julianamelendez.app_login.service.BasicAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private BasicAuthService basicAuthService;
    @Autowired
    private BasicAuthRepository basicAuthRepository;

    @GetMapping("/registro")
    public String showRegistrationForm(Model model) {
        model.addAttribute("users", new User());
        return "registro";
    }

    @PostMapping("/registro")
    public String register(@ModelAttribute("users") User user, Model model) {
        System.out.println("prueba"+user.getType());
        basicAuthRepository.save(user);
        model.addAttribute("message", "User registered successfully");
        return "redirect:/index";
    }
}
