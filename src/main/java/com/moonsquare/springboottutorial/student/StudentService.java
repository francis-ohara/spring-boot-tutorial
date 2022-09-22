package com.moonsquare.springboottutorial.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(0L, "Francis O'Hara Aidoo", "francis-ohara@outlook.com", LocalDate.of(2001, 8, 24), 21),
                new Student(0L, "Francisca O'Hara Aidoo", "franciscaohara24@gmail.com", LocalDate.of(2001, 8, 24), 21)
                );
    }
}
