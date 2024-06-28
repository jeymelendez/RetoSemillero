package com.julianamelendez.app_login.controller;

import com.julianamelendez.app_login.auth.type.BasicAuthenticador;
import com.julianamelendez.app_login.entity.User;
import com.julianamelendez.app_login.service.BasicAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller


public class OauthController {

    @Autowired
    private BasicAuthService basicAuthService;

    private BasicAuthenticador basicAuthenticador;



}
