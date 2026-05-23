package org.example.java.traditional.nonstream.services;

import org.example.java.traditional.nonstream.dto.UserRequest;
import org.example.java.traditional.nonstream.entity.UserEntity;
import org.example.java.traditional.nonstream.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public void manipulateUser(List<UserRequest> userList) {
        List<UserEntity> userEntities = new ArrayList<>();
        for (UserRequest userRequest : userList) {
            if (userRequest.name().startsWith("A") && userRequest.age() > 18) {
                UserEntity userEntity = new UserEntity();
                userEntity.setId(userRequest.id());
                userEntity.setName(userRequest.name());
                userEntity.setAddress(userRequest.address());
                userEntity.setEmail(userRequest.email());
                userEntity.setPhoneNumber(userRequest.phoneNumber());
                userEntities.add(userEntity);
            }
        }
        userRepository.saveUser(userEntities);
    }
}
