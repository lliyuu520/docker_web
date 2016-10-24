package com.liliangyu.docker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 支持rest风格控制器
 */
@RestController
@RequestMapping("/system")
public class SystemRest {
    @RequestMapping(value = "/login")
    public Map login() {
        Map<Object, Object> map = new HashMap<>();
        map.put("success", true);
        return map;
    }
}
