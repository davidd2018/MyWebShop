package com.example.WebShop.models;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegisterDto {

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;


    @NotEmpty
    @Email
    private String email;

    @Size(min = 6, message = "Minimum password length is 6 characters")
    private String password;
    private String confirmPassword;

    private String phone;
    private String address;
    private String status;
}
