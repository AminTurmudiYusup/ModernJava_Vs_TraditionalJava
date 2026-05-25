package org.example.java.traditional.switchs.service;

import org.example.java.traditional.switchs.domain.UserRoles;

public class GeneralService {
    /**
     * - Returns an authorization message based on the given user role.
     * - Uses enhanced switch expression with enum
     * - Each role maps to a specific permission level
     */
    public void printAuthorization(UserRoles userRoles) {
        switch (userRoles) {
            case ADMIN:
                System.out.println("You get all access");
                break;
            case MANAGER:
                System.out.println("You get reporting");
                break;
            case CUSTOMER:
                System.out.println("You can transaction");
                break;
            case GUEST:
                System.out.println("Login page");
                break;
        }
    }

    /**
     * - Determines and prints the student grade using traditional switch statement
     * - Matches exact grade values (100, 90)
     * - Uses break to prevent fall-through
     * - Defaults to grade C for all other values
     * - Note: For range-based conditions, using if-else is more appropriate.
     * This example is intentionally simplified to demonstrate traditional switch usage.
     */
    public void checkStudentGrade(int grade) {
        switch (grade) {
            case 100:
                System.out.println("Your grade A");
                break;
            case 90:
                System.out.println("your grade B");
                break;
            default:
                System.out.println("Your grade C");
        }
    }
}
