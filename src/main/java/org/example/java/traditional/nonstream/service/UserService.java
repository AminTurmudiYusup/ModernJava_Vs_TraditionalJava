package org.example.java.traditional.nonstream.service;

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

    /**
     * - Processes a list of UserRequest objects using Stream API.
     * - Filters users whose name starts with "A"
     * - Filters users with age greater than 18
     * - Maps each UserRequest (DTO) to a UserEntity
     * - Collects the result into a list
     * - Saves the list using the repository layer
     */
    public void manipulateUser(List<UserRequest> userList) {
        List<UserEntity> userEntities = new ArrayList<>();
        for (UserRequest userRequest : userList) {
            if (userRequest.getName().startsWith("A") && userRequest.getAge() > 18) {
                UserEntity userEntity = new UserEntity();
                userEntity.setId(userRequest.getId());
                userEntity.setName(userRequest.getName());
                userEntity.setAddress(userRequest.getAddress());
                userEntity.setEmail(userRequest.getEmail());
                userEntity.setPhoneNumber(userRequest.getPhoneNumber());
                userEntities.add(userEntity);
            }
        }
        userRepository.saveUser(userEntities);
    }
}
