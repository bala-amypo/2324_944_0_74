package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity{
    @Id
    private long id;
    @NotBlank(message = can be anythin)
    private String name;
    @colunm(name=unique)
    private String email;


}