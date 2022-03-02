package com.example.student_Management_system.service;

import com.example.student_Management_system.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    Student saveStudent(Student student);
    void deleteStudentById( Long id);
}
