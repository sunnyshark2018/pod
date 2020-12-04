/**
* @Description //TODO
* @Date $ $
* @Author huangwb
**/
package com.example.demo.controller;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
*/
@RestController
public class UserController {
    @GetMapping("/user")
    public String getUser() {
        return "do not pod me";
    }
}
