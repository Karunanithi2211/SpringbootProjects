package com.nivak.expencetracker.Services;

import java.util.List;

import com.nivak.expencetracker.Entity.Expenses;

public interface ExpenseService {
    List<Expenses> findAll();

    void save(Expenses expenses);

    Expenses findById(Long id);

    void delete(Long id);
}
