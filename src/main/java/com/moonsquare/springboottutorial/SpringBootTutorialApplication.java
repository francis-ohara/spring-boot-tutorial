package com.moonsquare.springboottutorial;

import com.moonsquare.springboottutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping
    public String homePage() {
        return "Welcome to the Home Page!!!\n\tYou are my world. You are my God. And I lay down my life for you.";
    }

}

