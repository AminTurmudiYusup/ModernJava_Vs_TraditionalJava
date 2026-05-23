package org.example.java.modern.stream.services;

import org.example.java.modern.stream.dto.UserRequest;
import org.example.java.modern.stream.entity.UserEntity;
import org.example.java.modern.stream.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public void manipulateUser(List<UserRequest> userList) {
        var userEntitys = userList.stream()
                .filter(user -> user.name().startsWith("A"))
                .filter(user -> user.age() > 18)
                .map(userRequest -> {
                    UserEntity userEntity = new UserEntity();
                    userEntity.setId(userRequest.id());
                    userEntity.setName(userRequest.name());
                    userEntity.setAddress(userRequest.address());
                    userEntity.setEmail(userRequest.email());
                    userEntity.setPhoneNumber(userRequest.phoneNumber());
                    return userEntity;
                }).toList();
        userRepository.saveUser(userEntitys);
    }
}
