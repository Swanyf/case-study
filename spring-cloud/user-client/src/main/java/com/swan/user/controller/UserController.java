package com.swan.user.controller;

import com.swan.eureka.entity.ResponseEntity;
import com.swan.eureka.entity.StatusCode;
import com.swan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findAll() {
        return new ResponseEntity(true, StatusCode.SUCCESS.getCode(), "查询成功", userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id) {
        System.out.println(7003);
        return new ResponseEntity(true, StatusCode.SUCCESS.getCode(), "查询成功", userService.findById(id));
    }

}
