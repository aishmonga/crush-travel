package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentObj{
    public String name;
    public int roll ;


    @PostMapping("/request")
    public void reqController( @RequestBody StudentObj studentObj ){
       System.out.println(studentObj.name +" "+ studentObj.roll);
    }
}