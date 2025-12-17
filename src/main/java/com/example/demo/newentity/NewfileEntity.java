package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity{
    @Id
    private long id;
    @NotBlank(message = "no spaces")
    private String name;
    @colunm(name=unique)
    @NotBlank(message = "no blank allowed")
    @Email(message="invalid format")
    private String email;


}