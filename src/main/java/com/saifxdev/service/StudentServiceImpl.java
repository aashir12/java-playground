package com.saifxdev.service;

import com.saifxdev.dto.StudentDeleteResponse;
import com.saifxdev.exception.StudentNotException;
import com.saifxdev.model.Student;
import com.saifxdev.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
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
    @Transactional
    public StudentDeleteResponse deleteStudentByRollNumber(String rollNumber) {
        Student student = studentRepository.findByRollNumber(rollNumber)
                .orElseThrow(() -> new StudentNotException(
                        "Student not found with Roll Number: " + rollNumber
                ));

        StudentDeleteResponse response = new StudentDeleteResponse(
                "Student deleted successfully",
                student.getId(),
                student.getName(),
                student.getRollNumber(),
                new HashSet<>(student.getSubjects()),
                new ArrayList<>(student.getWeeklyAttendance())
        );

        studentRepository.delete(student);
        return response;
    }

    @Override
    public CompletableFuture<Double> getAttendancePercentage(Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotException("Student not found with ID: " + studentId));
        return attendanceProcessor.calculatePercentageAsync(student.getWeeklyAttendance());
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}