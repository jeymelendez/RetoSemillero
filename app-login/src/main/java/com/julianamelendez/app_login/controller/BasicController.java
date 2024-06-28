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

public class BasicController {

    @Autowired
    private BasicAuthService basicAuthService;

    private BasicAuthenticador basicAuthenticador;


    @GetMapping("/formbasic")
    public ModelAndView showFormBasic() {
        ModelAndView vista = new ModelAndView();
        vista.setViewName("formbasic");
        vista.addObject("userData", new User());
        vista.addObject("error", false);
        return vista;
    }

    @PostMapping("/formbasic")
    public ModelAndView authFormBasic(@ModelAttribute User userData) throws Exception {
        ModelAndView vista = new ModelAndView();

        try {

            boolean check = this.basicAuthService.findByUser(userData.getUsername(), userData.getPassword());
            if (check == true) {
                System.out.println("Usuario ingresado => " + userData.getUsername() + userData.getPassword());

                vista.setViewName("inicio");
                vista.addObject("userData", userData);

                this.basicAuthenticador.setAuthMethod("basic");
                this.basicAuthenticador.authenticate();
            } else {

                vista.addObject("error", true);

            }

        } catch (Exception e) {

            vista.addObject("error", e.getMessage());


        }

        return vista;

    }

}
