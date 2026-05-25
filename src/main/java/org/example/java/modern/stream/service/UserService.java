package org.example.java.modern.stream.service;

import org.example.java.modern.stream.dto.UserRequest;
import org.example.java.modern.stream.entity.UserEntity;
import org.example.java.modern.stream.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    /**
     * - Processes a list of UserRequest objects using Stream API.
     * - Filters users whose name starts with "A"
     * - Filters users with age greater than 18
     * - Maps each UserRequest (DTO) to a UserEntity
     * - Collects the result into a list
     * - Saves the list using the repository layer
     */
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
