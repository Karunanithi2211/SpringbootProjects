package com.kavin.student.service;

import java.util.List;

import com.kavin.student.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student savStudent(Student student);

    Student getStudent(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);
}
