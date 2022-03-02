package com.example.student_Management_system.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.student_Management_system.service.StudentService;
import com.example.student_Management_system.entity.Student;
import org.springframework.stereotype.Service;
import com.example.student_Management_system.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {
    @Autowired
public StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudent() {

        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
studentRepository.deleteById(id);
    }
}
