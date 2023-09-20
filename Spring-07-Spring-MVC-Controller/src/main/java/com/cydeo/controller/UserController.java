package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String user() {

        return "/user/userinfo.html";
           // where to look for HTML page : endpoint
           // go to folder static and look overthere
    }
}