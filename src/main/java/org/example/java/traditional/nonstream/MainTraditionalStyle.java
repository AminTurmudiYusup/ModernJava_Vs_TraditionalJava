package org.example.java.traditional.nonstream;

import org.example.java.traditional.nonstream.dto.UserRequest;
import org.example.java.traditional.nonstream.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class MainTraditionalStyle {
    public static void main(String[] args) {
        var userRequests = new ArrayList<UserRequest>(List.of(
                new UserRequest(1, "Liam Henderson", "742 Evergreen Terr, Springfield, IL", "liam.h@email.com", "+1-555-0101", 29),
                new UserRequest(2, "Olivia Martinez", "1028 Beacon St, Boston, MA", "olivia.m@email.com", "+1-555-0102", 34),
                new UserRequest(3, "Noah Takahashi", "56 Shinjuku Chome, Tokyo, JP", "noah.t@email.com", "+81-90-5555-0103", 24),
                new UserRequest(4, "Emma Watson", "42 High St, London, UK", "emma.w@email.com", "+44-20-7946-0104", 31),
                new UserRequest(5, "Chao Nguyen", "89 Le Loi St, District 1, HCM", "chao.n@email.com", "+84-28-3829-0105", 15),
                new UserRequest(6, "Amara Okafor", "12 Kingsway Rd, Ikoyi, Lagos", "amara.o@email.com", "+234-1-271-0106", 19),
                new UserRequest(7, "Lucas Müller", "Kaiserstraße 14, Frankfurt, DE", "lucas.m@email.com", "+49-69-1234-0107", 38),
                new UserRequest(8, "Sofia Rossi", "Via dei Fori Imperiali 9, Rome, IT", "sofia.r@email.com", "+39-06-698-0108", 52),
                new UserRequest(9, "Aarav Sharma", "Connaught Place Block A, New Delhi, IN", "aarav.s@email.com", "+91-11-2341-0109", 19),
                new UserRequest(10, "Chloe Dubois", "21 Rue de Rivoli, Paris, FR", "chloe.d@email.com", "+33-1-4296-0110", 63)
        ));
        UserService userService = new UserService();
        userService.manipulateUser(userRequests);


    }
}
