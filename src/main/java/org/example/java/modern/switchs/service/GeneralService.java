package org.example.java.modern.switchs.service;

import org.example.java.modern.switchs.domain.UserRoles;
import org.example.java.modern.switchs.dto.Point;

public class GeneralService {
    public void procesInput(Object object) {
        switch (object) {
            case Integer integer -> System.out.println("The object type is integer >>>" + (integer + 2));
            case String string -> System.out.println("The object type is string >>>" + string.toLowerCase());
            default -> System.out.println("Unknown type object");
        }
    }


    public void printLocation(Object object) {
        switch (object) {
            case Point(int x, int y) -> System.out.println("x value " + x + " y value " + y);
            default -> System.out.println("Not point!");
        }
    }

    public String getRole(UserRoles userRole) {
        return switch (userRole) {
            case ADMIN -> "You get all access";
            case MANAGER -> "You get reporting";
            case CUSTOMER -> "You can transaction";
            case GUEST -> "Login page";
        };
    }

}
