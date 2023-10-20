package com.kavin.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kavin.student.entity.Student;
import com.kavin.student.repository.StudentRepository;
import com.kavin.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    
    

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }



    @Override
    public Student savStudent(Student student) {
        return studentRepository.save(student);
    }



    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();

    }



    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }



    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
}
