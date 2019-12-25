package com.example.aditya.jpaExample.Controllers;

import com.example.aditya.jpaExample.Entities.User;
import com.example.aditya.jpaExample.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class DemoController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<User> getAllUse() {
        log.info("inside findall method");
        return userRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public User getByName(@PathVariable final String name) {
        log.info("finding data for " + name);
        return userRepository.findByName(name);
    }

    @PostMapping(value = "/add")
    public User addUser(@RequestBody final User user) {
        userRepository.save(user);
        return getByName(user.getName());
    }
}
