package com.appsbylyn.projectSpringApplication;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void createStudent(Student student);
}
