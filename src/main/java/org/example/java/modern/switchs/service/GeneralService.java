package org.example.java.modern.switchs.service;

import org.example.java.modern.switchs.domain.UserRoles;
import org.example.java.modern.switchs.dto.Point;

public class GeneralService {
    /**
     * Processes an input object using pattern matching for switch.
     * - Identifies the runtime type of the object
     * - Applies type-specific logic (e.g., math for Integer, formatting for String)
     * - Prints the result to the console
     */
    public void procesInput(Object object) {
        switch (object) {
            case Integer integer -> System.out.println("The object type is integer >>>" + (integer + 2));
            case String string -> System.out.println("The object type is string >>>" + string.toLowerCase());
            default -> System.out.println("Unknown type object");
        }
    }

    /**
     * - Extracts and prints coordinates if the input object is a Point record.
     * - Uses record pattern matching to destructure the object into x and y
     * - Prints the coordinate values
     * - Falls back if the object is not a Point
     */
    public void printLocation(Object object) {
        switch (object) {
            case Point(int x, int y) -> System.out.println("x value " + x + " y value " + y);
            default -> System.out.println("Not point!");
        }
    }

    /**
     * - Returns an authorization message based on the given user role.
     * - Uses enhanced switch expression with enum
     * - Each role maps to a specific permission level
     */
    public String getRole(UserRoles userRole) {
        return switch (userRole) {
            case ADMIN -> "You get all access";
            case MANAGER -> "You get reporting";
            case CUSTOMER -> "You can transaction";
            case GUEST -> "Login page";
        };
    }

}
