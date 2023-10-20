package com.nivak.expencetracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nivak.expencetracker.Entity.Expenses;


@Repository
public interface ExpenseRepository extends JpaRepository<Expenses, Long> {
    
}
