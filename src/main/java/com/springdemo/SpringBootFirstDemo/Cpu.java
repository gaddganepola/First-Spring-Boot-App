package com.springdemo.SpringBootFirstDemo;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
    public void core() {
        System.out.println("Compile with 2 cores");
    }
}
