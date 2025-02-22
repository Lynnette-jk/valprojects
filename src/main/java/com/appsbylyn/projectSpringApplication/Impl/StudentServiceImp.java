package com.appsbylyn.projectSpringApplication.Impl;

import com.appsbylyn.projectSpringApplication.Student;
import com.appsbylyn.projectSpringApplication.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    private List<Student> students =new ArrayList<>();


    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void createStudent(Student student) {
        students.add(student);

    }
}
