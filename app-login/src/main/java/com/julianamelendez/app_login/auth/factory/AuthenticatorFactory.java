package com.julianamelendez.app_login.auth.factory;

import com.julianamelendez.app_login.auth.Authenticador;
import com.julianamelendez.app_login.auth.type.BasicAuthenticador;
import com.julianamelendez.app_login.auth.type.OAuthAuthenticator;

public class AuthenticatorFactory {
    public AuthenticatorFactory() {
    }

    public Authenticador getAuthenticador(String type){

        if(type.equals("basic")){
            System.out.println("Tipo de autenticación: "+type);
            return new BasicAuthenticador();
        }else if(type.equals("oauth")){
            System.out.println("Tipo de autenticación: "+type);
            return new OAuthAuthenticator();
        }
        return null;
    }
}
