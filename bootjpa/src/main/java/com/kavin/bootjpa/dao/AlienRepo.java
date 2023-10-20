package com.kavin.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.kavin.bootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
    
}
