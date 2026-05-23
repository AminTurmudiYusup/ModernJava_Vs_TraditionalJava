package org.example.java.traditional.nonstream.repository;

import org.example.java.traditional.nonstream.entity.UserEntity;

import java.util.List;

public class UserRepository {
    public String saveUser(List<UserEntity> userEntities) {
        for (UserEntity userEntity : userEntities)
            System.out.println(userEntity.getId() + " " + userEntity.getName());
        return "Success save user";
    }
}
