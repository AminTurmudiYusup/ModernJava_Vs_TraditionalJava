package org.example.java.traditional.switchs;

import org.example.java.traditional.switchs.domain.UserRoles;
import org.example.java.traditional.switchs.service.GeneralService;

public class MainSwitch {
    public static void main(String[] args) {
        GeneralService generalService = new GeneralService();
        UserRoles userRole = UserRoles.GUEST;
        generalService.printAuthorization(userRole);
        int gradeStudent = 10;
        generalService.checkStudentGrade(gradeStudent);
    }
}
