package com.example.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student johnDoe = new Student(
                    "John Doe",
                    "j.doe@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 20)
            );

            Student joeBlack = new Student(
                    "Joe Black",
                    "j.black@gmail.com",
                    LocalDate.of(2002, FEBRUARY, 15)
            );

            studentRepository.saveAll(
                    List.of(johnDoe, joeBlack)
            );
        };
    }
}
