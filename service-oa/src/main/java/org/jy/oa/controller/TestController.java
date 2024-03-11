package org.jy.oa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/success")
    public String test(){
        return "<h1>success</h1>";
    }

}
