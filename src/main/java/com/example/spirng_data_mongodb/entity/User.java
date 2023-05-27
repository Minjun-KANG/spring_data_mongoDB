package com.example.spirng_data_mongodb.entity;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author : Minjun-KANG
 * @date : 2023-05-23
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private Integer age;
    private String sex;
}
