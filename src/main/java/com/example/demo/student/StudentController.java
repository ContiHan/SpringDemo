package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping(path = "api/v1/student")
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "John Doe",
                        "j.doe@gmail.com",
                        LocalDate.of(2000, Month.FEBRUARY, 20),
                        23
                ));
    }
}
