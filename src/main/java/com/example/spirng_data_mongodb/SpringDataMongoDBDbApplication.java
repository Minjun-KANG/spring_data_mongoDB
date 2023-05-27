package com.example.spirng_data_mongodb;

import com.example.spirng_data_mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.MongoDbFactoryParser;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataMongoDBDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMongoDBDbApplication.class, args);

    }
}
