package com.springboot.blog.payload;

import lombok.*;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
}
