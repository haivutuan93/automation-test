package com.example.demo.service;

import com.example.demo.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    HelloRepository helloRepository;

    @Autowired
    ChildService childService;

    @Override
    public String get() {
        return helloRepository.get();
    }

    public String getChildService(){
        return childService.get();
    }
}
