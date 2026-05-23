package org.example.java.modern.stream.repository;

import org.example.java.modern.stream.entity.UserEntity;

import java.util.List;

public class UserRepository {
    public String saveUser(List<UserEntity> userEntities) {
        userEntities.forEach(userEntity -> System.out.println(userEntity.getId() + " " + userEntity.getName()));
        return "Success save user";
    }
}
