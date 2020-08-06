package com.kodilla.ecommercee.domain;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class UserDto {
    private Long id;
    private String userName;
    private int status;
    private Long userKey;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate registerDate;
    private String email;
    private String city;
    private String postCode;
    private String street;
    private String houseNr;
    private String apartmentNr;
    private String phoneNumber;
    private boolean isBlocked;
    private String login;
    private String password;
//    private List<Order> orders;
//    private Cart cart;
}

