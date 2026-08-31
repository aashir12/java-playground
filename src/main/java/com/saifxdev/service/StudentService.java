package com.saifxdev.service;

import com.saifxdev.model.Student;

import java.util.concurrent.CompletableFuture;

public interface StudentService{
    Student registerStudent(Student student);
    Student getStudentByRollNumber(String rollNumber);
    CompletableFuture<Double> getAttendancePercentage(Long StudentId);
}