package com.banko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClientDto {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String telephone;
    private String email;
    private String address;
}
