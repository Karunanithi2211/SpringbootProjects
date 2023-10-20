package com.nivak.demoweb.dao;

import org.springframework.data.repository.CrudRepository;

import com.nivak.demoweb.model.UserSt;

public interface UserDAO extends CrudRepository<UserSt, Integer>{
    
}
