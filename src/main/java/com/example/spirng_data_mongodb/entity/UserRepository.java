package com.example.spirng_data_mongodb.entity;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author : Minjun-KANG
 * @date : 2023-05-23
 */

@EnableMongoRepositories
public interface UserRepository extends MongoRepository<User, Long> {
}
