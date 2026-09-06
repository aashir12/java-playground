package com.saifxdev.exception;

public class StudentNotException extends RuntimeException{
    // students expception handler
    public StudentNotException(String message){
        super(message);
    }
}