package org.example.java.traditional.nonoptional;

import org.example.java.traditional.nonoptional.dto.UserRequest;

public class MainNonOptional {
    public static void main(String[] args) {
        UserRequest userRequest = new UserRequest(1, "Liam Henderson", "742 Evergreen Terr, Springfield, IL", "liam.h@email.com", "+1-555-0101", 29);
        UserRequest userNull = null;
        if (userRequest == null) {
            //do nothing
        } else
            System.out.println(userRequest.getId() + " " + userRequest.getName());
        String defaultName = userNull != null ? userRequest.getName() : "Anonymous";
        System.out.println(defaultName);

        if (userNull == null) {
            throw new RuntimeException("User Not found!!!");
        }
    }
}
