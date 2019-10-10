package com.swan.admin.controller;

import com.swan.admin.feign.UserFeignClient;
import com.swan.eureka.entity.ResponseEntity;
import com.swan.eureka.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

@Autowired
private UserFeignClient userFeignClient;

@GetMapping
public ResponseEntity findAll() {
    return new ResponseEntity(true, StatusCode.SUCCESS.getCode(), "查询成功", userFeignClient.findAll());
}

@GetMapping("/user/{id}")
public ResponseEntity findUserById(@PathVariable("id") String id) {
    return new ResponseEntity(true, StatusCode.SUCCESS.getCode(), "查询成功", userFeignClient.findById(id));
}

}
