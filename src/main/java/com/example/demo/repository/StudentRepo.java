package com.example.demo.respository;

import org.springframework.data.jpa.repository,JpaRepository;
import org.springframework.stereotype.Repository

import com.example.demo.entity.student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}