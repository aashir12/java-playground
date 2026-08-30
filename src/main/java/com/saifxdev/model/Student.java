package com.saifxdev.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

@Entity
@Table(name = "students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String rollNumber;

    @ElementCollection
    @CollectionTable(name = "student_subjects", joinColumns = @JoinColumn(name="student_id"))
    @Column(name = "subject")
    private Set<String> subjects = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "student_attendance" , joinColumns = @JoinColumn(name = "student_id"))
    @Column(name = "present")
    private List<Boolean> weeklyAttendance = new ArrayList<>();

    public Student(){};

    public Student(String name,String rollNumber){
        this.name= name;
        this.rollNumber = rollNumber;
    }

    public Long getId(){ return id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber(){return rollNumber;}

    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }

    public Set<String> getSubjects(){return  subjects;}
    public List<Boolean> getWeeklyAttendance(){return weeklyAttendance;}
}