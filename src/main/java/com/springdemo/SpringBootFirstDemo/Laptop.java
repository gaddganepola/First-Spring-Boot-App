package com.springdemo.SpringBootFirstDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    Cpu cpu;

    public void compile() {
        cpu.core();
        System.out.println("Compile the code");
    }
}
