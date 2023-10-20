package com.kavin.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kavin.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
