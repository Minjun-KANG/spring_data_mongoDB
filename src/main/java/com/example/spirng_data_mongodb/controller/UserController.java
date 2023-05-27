package com.example.spirng_data_mongodb.controller;

import com.example.spirng_data_mongodb.dto.UserDto;
import com.example.spirng_data_mongodb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Minjun-KANG
 * @date : 2023-05-27
 */


@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> getUser(){
        return ResponseEntity.ok(userService.getUser());
    }

    @PostMapping("/user")
    public ResponseEntity<String> createUser(
            @RequestBody UserDto requestDto
    ){
        return ResponseEntity.ok(userService.saveUser(requestDto));
    }
}
