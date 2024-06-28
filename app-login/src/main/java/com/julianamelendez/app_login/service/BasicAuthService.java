package com.julianamelendez.app_login.service;

import com.julianamelendez.app_login.entity.User;
import com.julianamelendez.app_login.repository.BasicAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class BasicAuthService  {

    @Autowired
    BasicAuthRepository basicAuthRepository;

    @Transactional
    public boolean findByUser(String username, String password) throws Exception {
        User user = this.basicAuthRepository.findByUsernameAndPassword(username,password);

        try {
            if (user != null) {
                System.out.println("---LOGIN EXITOSO---" + user.getUsername());
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

}
