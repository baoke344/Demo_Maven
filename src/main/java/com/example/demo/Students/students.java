package com.example.demo.Students;

import java.time.LocalDate;

public class students {
    private String name;
    private Integer age;
    private String email;
    private LocalDate dob;
    private Long id;

    public students(Long id, String name, String email, LocalDate dob, Integer age){
        this.age = age;
        this.name = name;
        this.email = email;
        this.id = id;
        this.dob = dob;

    }

    public students(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", id=" + id +
                '}';
    }
}
