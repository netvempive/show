package com.yonyou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class AppController {

    @RequestMapping("/info")
    public Object info() {
        Map<String, Object> map = new HashMap<>();
        map.put("info", "hello hello hello");
        return map;
    }

}