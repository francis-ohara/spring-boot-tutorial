package com.moonsquare.springboottutorial.student;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student(){
        this.id = 0L;
        this.name = "Unknown";
        this.email = "xxxxxxx@gmail.com";
        this.dob = LocalDate.now();
        this.age = 0;
    }

    public Student(Long id, String name, String email, LocalDate dob, Integer age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student (String name, String email, LocalDate dob,  Integer age){
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getID(){
        return this.id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public void setDob(LocalDate dob){
        this.dob = dob;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String toString(){
        return "Student{id="+id+", name="+name+", dob="+dob+", age="+age+", email="+email+"}";
    }
}
