package com.example.springqualifier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringQualifierApplication implements CommandLineRunner {


    /*@Autowired
    private MyBean mybean;*/

    public static void main(String[] args) {
        SpringApplication.run(SpringQualifierApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
