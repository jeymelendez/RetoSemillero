package com.julianamelendez.app_login.auth.type;

import com.julianamelendez.app_login.auth.AbstractAuthenticador;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(value = "basicAut")

public class BasicAuthenticador extends AbstractAuthenticador {

    public BasicAuthenticador() {
    }

    public BasicAuthenticador(String authMethod) {
        super(authMethod);
    }


    @Override
    public void authenticate() {

        System.out.println("-- Login realizado con Autenticación Básica");
    }


}
