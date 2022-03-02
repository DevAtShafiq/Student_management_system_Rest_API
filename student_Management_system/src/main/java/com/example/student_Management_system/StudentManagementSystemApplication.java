package com.example.student_Management_system;
import com.example.student_Management_system.entity.Student;
import com.example.student_Management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student= new Student("shafiq","islam","shafiq@hotman.com");
		studentRepository.save(student);
	}
}
