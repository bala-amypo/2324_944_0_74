package com.example.demo.entity;

import java.time.LocalDate;

public class Studententity {
    @id
    @generateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @generateValue(strategy = GenerationType.Auto)
    private String name;
    @column(name=email)
    private string email;
    private string password;
    

    

    public Studententity(float cgpa, LocalDate date, int id, String name) {
        this.cgpa = cgpa;
        this.date = date;
        this.id = id;
        this.name = name;
    }

    public Studententity() {
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

}