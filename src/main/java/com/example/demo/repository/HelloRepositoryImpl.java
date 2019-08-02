package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository{

    @Override
    public String get() {
        return "Hello Repository";
    }

    @Override
    public String notConfig() {
        return null;
    }
}
