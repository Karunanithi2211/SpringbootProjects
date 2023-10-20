package com.nivak.expencetracker.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivak.expencetracker.Entity.Expenses;
import com.nivak.expencetracker.Repository.ExpenseRepository;

@Service
public class ExpenseServiceImpls implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expenses> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public void save(Expenses expenses) {
        expenses.setCreatedAt(System.currentTimeMillis());
        expenseRepository.save(expenses);
    }

    @Override
    public Expenses findById(Long id) {
        if (expenseRepository.findById(id).isPresent()) {
            return expenseRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        expenseRepository.deleteById(id);
    }
    
}
