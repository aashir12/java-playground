package com.saifxdev.service;

import com.saifxdev.model.Student;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
public class AttendanceProcessor {

    // Single Responsibility Principle (SRP): Handles background processing only
    @Async
    public CompletableFuture<Double> calculatePercentageAsync(List<Boolean> attendance) {
        return CompletableFuture.supplyAsync(() -> {
            if (attendance == null || attendance.isEmpty()) return 0.0;
            long presentCount = attendance.stream().filter(b -> b).count();
            return ((double) presentCount / attendance.size()) * 100;
        });
    }
}