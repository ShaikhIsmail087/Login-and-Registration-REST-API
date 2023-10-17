package com.springboot.blog.payload;

import lombok.*;

@Data
public class JWTAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    
}
