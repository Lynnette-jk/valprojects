package com.appsbylyn.projectSpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students =new ArrayList<>();

   @GetMapping("/message")
    public String welcomeMessage(){
        return "Hello World";
    }
    @GetMapping("/students")
    public List<Student> findAll(){
       return students;
    }
}
