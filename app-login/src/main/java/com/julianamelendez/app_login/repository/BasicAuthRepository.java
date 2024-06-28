package com.julianamelendez.app_login.repository;


import com.julianamelendez.app_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BasicAuthRepository extends JpaRepository<User,Long> {
    @Query(value="SELECT * FROM users where users.username LIKE %:username% AND users.password = :password;", nativeQuery = true)
   // User findByUsernameAndPassword(@Param("username") String username);//(String username,String password);
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
