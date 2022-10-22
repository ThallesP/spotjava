package me.thalles.spotjava.spotjava.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler()
    public String handleExceptions(SongNotFoundException ex) {
        return ex.getMessage();
    }
}