package com.example.loginauthapi.Repositories;

import com.example.loginauthapi.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
