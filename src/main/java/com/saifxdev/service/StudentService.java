package com.saifxdev.service;

import com.saifxdev.model.Student;

import java.awt.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface StudentService{
    Student registerStudent(Student student);
    Student getStudentByRollNumber(String rollNumber);
    CompletableFuture<Double> getAttendancePercentage(Long StudentId);
    List<Student> getAllStudents();
}