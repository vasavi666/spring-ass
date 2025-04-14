package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my_first_api")
public class helloworld {


    @Autowired
    private StudentRepository studentRepository;
    @GetMapping
    public String myFirstAPIMethod(){

        return studentRepository.findAll().toString();
    }
    @PostMapping
    public void myFirstAPIMethod(@RequestBody Students students){
        studentRepository.save(students);
    }
}
