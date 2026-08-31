package com.saifxdev.service;

import com.saifxdev.exception.StudentNotException;
import com.saifxdev.model.Student;
import com.saifxdev.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service // Spring Bean Annotation
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final AttendanceProcessor attendanceProcessor;

    // Dependency Injection via constructor
    public StudentServiceImpl(StudentRepository studentRepository, AttendanceProcessor attendanceProcessor) {
        this.studentRepository = studentRepository;
        this.attendanceProcessor = attendanceProcessor;
    }

    @Override
    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentByRollNumber(String rollNumber) {
        return studentRepository.findByRollNumber(rollNumber)
                .orElseThrow(() -> new StudentNotException("Student not found with Roll Number: " + rollNumber));
    }

    @Override
    public CompletableFuture<Double> getAttendancePercentage(Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotException("Student not found with ID: " + studentId));
        return attendanceProcessor.calculatePercentageAsync(student.getWeeklyAttendance());
    }
}