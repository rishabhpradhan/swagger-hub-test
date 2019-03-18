package com.rpradhan.sht.controller;

import com.rpradhan.sht.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rpradhan
 */
@RestController
public class UserController {

    @GetMapping("/users/{name}")
    public User getUser(@PathVariable String name) {
        return new User(name, name + "gmail.com");
    }

}
