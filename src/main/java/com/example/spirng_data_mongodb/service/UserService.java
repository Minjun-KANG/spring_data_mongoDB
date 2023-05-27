package com.example.spirng_data_mongodb.service;

import com.example.spirng_data_mongodb.dto.UserDto;
import com.example.spirng_data_mongodb.entity.User;
import com.example.spirng_data_mongodb.entity.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Minjun-KANG
 * @date : 2023-05-23
 */

@AllArgsConstructor
@Transactional
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDto> getUser(){
        List<User> user = userRepository.findAll();

        List<UserDto> userResponseDtos = new ArrayList<>();
        for (User value : user) {
            userResponseDtos.add(UserDto.fromEntity(value));
            System.out.println("name : " + value.getName());
            System.out.println("age : " + value.getAge());
            System.out.println("sex : " + value.getSex());
        }

        return userResponseDtos;
    }

    public String saveUser(UserDto userDto) {
        return userRepository.save(UserDto.toEntity(userDto)).getId();
    }
}
