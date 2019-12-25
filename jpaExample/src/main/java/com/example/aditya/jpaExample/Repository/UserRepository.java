package com.example.aditya.jpaExample.Repository;

import com.example.aditya.jpaExample.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
