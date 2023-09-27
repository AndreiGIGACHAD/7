package com.example.testsecurity2dbthemeleaf.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testsecurity2dbthemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);
}