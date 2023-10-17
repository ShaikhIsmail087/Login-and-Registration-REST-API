package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
    
}
