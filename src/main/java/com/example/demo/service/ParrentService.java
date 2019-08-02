package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParrentService {
    @Autowired
    HelloService helloService;

    public String get(){
        return helloService.get();
    }
}
