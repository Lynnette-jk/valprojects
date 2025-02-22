package com.appsbylyn.projectSpringApplication.Impl;

import com.appsbylyn.projectSpringApplication.Student;
import com.appsbylyn.projectSpringApplication.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    private List<Student> students =new ArrayList<>();
    private Long nextId = 1L;


    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void createStudent(Student student) {
        student.setId(nextId++);
        students.add(student);

    }

    @Override
    public Student getStudentById(Long id) {
        for(Student student:students){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean deleteStudentById(Long id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getId().equals(id)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateStudent(Long id, Student updatedStudent) {
        for(Student student:students){
            if (student.getId().equals(id)){
                student.setSname(updatedStudent.getSname());
                student.setCourse(updatedStudent.getCourse());
                student.setGrade(updatedStudent.getGrade());
                student.setMarks(updatedStudent.getMarks());
                student.setStream(updatedStudent.getStream());
                return true;

            }

        }
        return false;
    }
}
