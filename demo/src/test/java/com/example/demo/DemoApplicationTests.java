package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.example.demo.Ttest.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Test
    public void contextLoads() {

        System.out.println(Ttest.ok("ookk"));
    }

}

