package com.springboot.validation.controller;

import com.springboot.validation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author Mohammed Amr
 * @created 02/01/2021 - 15:42
 * @project spring-boot-validation
 */

@Controller
public class UserController {

    @RequestMapping(path = "add")
    public String toAdd(User user) {
        return "add";
    }

    @RequestMapping(path = "addUser")
    public String add(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }

        System.out.println("Save user = " + user);
        return "success";
    }
}
