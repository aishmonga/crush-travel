package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class HomeController{
    public String message = "This is a message" ;
    public int num = 3;
    public Nest nest; 
    
    @RequestMapping("/response")
    public HomeController PrintResponse(){
        HomeController hc1 = new HomeController();
        Nest nestObj = new Nest();

        nestObj.a = 'b';
        nestObj.str = "nest string";
        hc1.nest = nestObj;

        return hc1;

    }   
}


