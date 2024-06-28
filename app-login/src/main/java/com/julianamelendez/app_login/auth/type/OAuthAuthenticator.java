package com.julianamelendez.app_login.auth.type;

import com.julianamelendez.app_login.auth.AbstractAuthenticador;

public class OAuthAuthenticator extends AbstractAuthenticador {

    public OAuthAuthenticator() {
    }

    @Override
    public void authenticate() {
        System.out.println("-- Login realizado con Autenticación:"+getAuthMethod());
    }
}
