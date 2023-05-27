package com.example.spirng_data_mongodb.dto;

import com.example.spirng_data_mongodb.entity.User;
import lombok.*;

/**
 * @author : Minjun-KANG
 * @date : 2023-05-27
 */

@Getter
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDto {
    private String name;
    private Integer age;
    private String sex;

    public static UserDto fromEntity(User user) {
        return UserDto.builder()
                .name(user.getName())
                .age(user.getAge())
                .sex(user.getSex())
                .build();
    }

    public static User toEntity(UserDto userDto) {
        return User.builder()
                .name(userDto.getName())
                .age(userDto.getAge())
                .sex(userDto.getSex())
                .build();
    }
}
