package com.julianamelendez.app_login.auth;


import com.julianamelendez.app_login.auth.Authenticador;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class AbstractAuthenticador implements Authenticador {
  private String authMethod;

    public AbstractAuthenticador(String authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public void authenticate() {
        System.out.println("Empieza con la autenticación");;
    }


    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }



}
