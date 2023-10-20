package com.kavin.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.kavin.student.entity.Student;
import com.kavin.student.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@Autowired
	public StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// Student s1= new Student("Kavin","M","kavinmano@2211");
		// studentRepository.save(s1);

		// Student s2= new Student("Luffy","D","onepieceluffy@2211");
		// studentRepository.save(s2);

		// Student s3= new Student("Zoro","R","kingofhell@2211");
		// studentRepository.save(s3);
	}

}
