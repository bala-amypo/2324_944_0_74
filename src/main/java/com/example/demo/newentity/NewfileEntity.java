package com.example.demo.newentity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

public class NewfileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "no spaces")
    private String name;
    @colunm(name=unique)
    @NotBlank(message = "no blank allowed")
    @Email(message="invalid format")
    private String email;



}