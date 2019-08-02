package com.example.demo;

import com.example.demo.repository.HelloRepository;
import com.example.demo.service.ChildService;
import com.example.demo.service.HelloService;
import com.example.demo.service.HelloServiceImpl;
import com.example.demo.service.ParrentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    @MockBean
    private HelloRepository helloRepository;

    @Autowired
    HelloService helloService;

    @Autowired
    ChildService childService;

    @Autowired
    ParrentService parrentService;

    @Before
    public void setMock(){
        Mockito.when(helloRepository.get()).thenReturn("aaa");
        System.out.println("Before");
    }

    @Test
    public void test1(){
        System.out.println("Hello Test1");
        Assert.assertEquals("aaa", helloRepository.get());
    }

    @Test
    public void test2(){
        System.out.println("Hello Test2");
        Assert.assertEquals("aaa", helloService.get());
    }

    @Test
    public void test3(){
        System.out.println("Hello Test3");
        Assert.assertEquals("aaa", helloService.get());
    }
}
