package com.appsbylyn.projectSpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/message")
    public String welcomeMessage(){
        return "Hello World";
    }
    @GetMapping("/students")
    public List<Student> findAll(){
       return studentService.findAll();
    }
    @PostMapping("/students")
    public String createStudent(@RequestBody Student student){
       studentService.createStudent(student);
       return "Student added Successfully";
    }
}
