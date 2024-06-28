package com.julianamelendez.app_login.controller;

import com.julianamelendez.app_login.auth.Authenticador;
import com.julianamelendez.app_login.auth.factory.AuthenticatorFactory;
import com.julianamelendez.app_login.auth.type.BasicAuthenticador;
import com.julianamelendez.app_login.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class LoginManager {


    Authenticador authenticador;


    public void setAuthenticator(Authenticador authenticador) {
        this.authenticador = authenticador;
    }

    @GetMapping("/index")
    public String showRegistrationForm(Model model) {
        model.addAttribute("users", new User());
        return "index";
    }

    /*Redirecciona al método de autenticación seleccionado*/
    @PostMapping("/index")
    public ModelAndView redirectAuth(@ModelAttribute User userData1) throws Exception {
        ModelAndView vista = new ModelAndView();

        AuthenticatorFactory factory = new AuthenticatorFactory();
        Authenticador authenticador = factory.getAuthenticador(userData1.getType());



        if (Objects.nonNull(authenticador)) {

          this.authenticador = authenticador;
          this.authenticador.authenticate();

            if (userData1.getType().equals("basic")) {

                vista.setViewName("formbasic");
            } else {
                vista.setViewName("formoauth");
            }

        } else {
            vista.setViewName("other");
        }

        return vista;
    }





}
