package com.saifxdev.controller;

import com.saifxdev.model.Student;
import com.saifxdev.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final StudentService studentService;

    public AttendanceController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.registerStudent(student));
    }

    @GetMapping("/student/{rollNumber}")
    public ResponseEntity<Student> getStudent(@PathVariable String rollNumber) {
        return ResponseEntity.ok(studentService.getStudentByRollNumber(rollNumber));
    }

    @GetMapping("/percentage/{id}")
    public CompletableFuture<ResponseEntity<Double>> getAttendancePercentage(@PathVariable Long id) {
        return studentService.getAttendancePercentage(id)
                .thenApply(ResponseEntity::ok);
    }
}