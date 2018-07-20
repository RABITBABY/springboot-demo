package com.example.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/hello")  
public class HelloController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/sts")
    public String helloworld(){  
        return "hello";  
    }  
}