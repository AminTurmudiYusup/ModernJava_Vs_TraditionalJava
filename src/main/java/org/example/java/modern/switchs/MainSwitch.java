package org.example.java.modern.switchs;

import org.example.java.modern.switchs.dto.Point;
import org.example.java.modern.switchs.services.GeneralService;

import static org.example.java.modern.switchs.domain.UserRoles.ADMIN;

public class MainSwitch {


    public static void main(String[] args) {
        // Assume you have an active user role variable initialized
        GeneralService generalService = new GeneralService();

        System.out.println(generalService.getRole(ADMIN));

        var value = 12;
        generalService.procesInput(value);
        var name = "YUSUP";
        generalService.procesInput(name);
        var decimalValue = 12.4;
        generalService.procesInput(decimalValue);
        Point point = new Point(12, 13);
        generalService.printLocation(point);

    }


}
