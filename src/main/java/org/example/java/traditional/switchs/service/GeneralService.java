package org.example.java.traditional.switchs.service;

import org.example.java.traditional.switchs.domain.UserRoles;

public class GeneralService {
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
