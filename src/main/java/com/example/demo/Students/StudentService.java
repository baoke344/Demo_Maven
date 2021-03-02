package com.example.demo.Students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<students> getStudents(){
        return List.of(
                new students(
                        1L,
                        "Baoke",
                        "baoanh301094@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )

        );
    }
}
