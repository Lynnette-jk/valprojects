package com.appsbylyn.projectSpringApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Student>> findAll(){
       return ResponseEntity.ok(studentService.findAll());
    }
    @PostMapping("/students")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
       studentService.createStudent(student);
       return new ResponseEntity<>("Student added Successfully", HttpStatus.OK);
    }
    @GetMapping("/students/{id}")

    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        if(student != null){
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @DeleteMapping("/students/{id}")

    public ResponseEntity<String> deleteStudentById(@PathVariable Long id){
        boolean deleted = studentService.deleteStudentById(id);
        if(deleted)
            return new ResponseEntity<>("Student Deleted Successfully", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/students/{id}")

    public ResponseEntity<String> updateStudent(@PathVariable Long id,@RequestBody Student updatedStudent){
        boolean updated = studentService.updateStudent(id, updatedStudent);
        if (updated)
            return new ResponseEntity<>("Student updated Successfully", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
