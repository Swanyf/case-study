package com.swan.admin.feign;

import com.swan.eureka.entity.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-client")
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    ResponseEntity findById(@PathVariable("id") String id);

    @GetMapping("/user")
    ResponseEntity findAll() ;
}
