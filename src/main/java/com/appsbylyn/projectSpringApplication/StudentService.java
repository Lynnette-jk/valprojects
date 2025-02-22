package com.appsbylyn.projectSpringApplication;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void createStudent(Student student);

    Student getStudentById(Long id);

    boolean deleteStudentById(Long id);

    boolean updateStudent(Long id, Student updatedStudent);
}
