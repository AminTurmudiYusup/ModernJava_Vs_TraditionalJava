package org.example.java.modern.optional;

import org.example.java.modern.optional.dto.UserRequest;

import java.util.Optional;

//Demonstrates usage of Optional to handle null-safe operations
public class MainOptional {
    public static void main(String[] args) {


        //- Example 1: Replace explicit null check using ifPresent()
        //- Executes the lambda only if userRequest is not null
        var userRequest = new UserRequest(1, "Liam Henderson", "742 Evergreen Terr, Springfield, IL", "liam.h@email.com", "+1-555-0101", 29);
        UserRequest userNull = null;
        Optional.ofNullable(userRequest).ifPresent(userRequest1 -> System.out.println(userRequest.id() + " " + userRequest.name()));

        // Example 2: Provide a default value if null
        // - Extracts the name if present, otherwise returns "Anonymous"
        String defaulUser = Optional.ofNullable(userRequest).map(UserRequest::name).orElse("Anonymous");
        System.out.println(defaulUser);

        // Example 3: Throw exception if value is null
        // - Throws RuntimeException when userNull is null
        Optional.ofNullable(userNull).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
