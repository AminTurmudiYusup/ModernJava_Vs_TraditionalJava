package org.example.java.modern.optional;

import org.example.java.modern.optional.dto.UserRequest;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        //replace null check
        var userRequest = new UserRequest(1, "Liam Henderson", "742 Evergreen Terr, Springfield, IL", "liam.h@email.com", "+1-555-0101", 29);
        UserRequest userNull = null;
        Optional.ofNullable(userRequest).ifPresent(userRequest1 -> System.out.println(userRequest.id() + " " + userRequest.name()));

        //return default value
        String defaulUser = Optional.ofNullable(userRequest).map(UserRequest::name).orElse("Anonymous");
        System.out.println(defaulUser);

        Optional.ofNullable(userNull).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
