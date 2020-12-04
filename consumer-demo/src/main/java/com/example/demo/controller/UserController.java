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

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DemoService demoService;
    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable String str) {
        return demoService.echo(str);
    }
}
