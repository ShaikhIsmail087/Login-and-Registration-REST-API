package com.springboot.blog.payload;

import lombok.*;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
