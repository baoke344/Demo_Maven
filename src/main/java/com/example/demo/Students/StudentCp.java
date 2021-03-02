package com.example.demo.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/students")
public class StudentCp {
    private final StudentService studentService;

    @Autowired
    public StudentCp(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<students> getStudents(){
        return studentService.getStudents();
    }



}
