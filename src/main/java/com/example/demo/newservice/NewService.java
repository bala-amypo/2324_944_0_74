package com.example.demo.newservice;
import com.example.demo.newentity.NewfileEntity;

public interface NewfileService{
    NewfileEntity savedata(NewfileEntity,newentity);
    NewfileEntity getidval(Long id);
    List<NewfileEntity> getall();
    NewfileEntity update()
}