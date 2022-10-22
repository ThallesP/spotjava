package me.thalles.spotjava.spotjava.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SongNotFoundException extends RuntimeException {
    private String message = "Song not found";
    public SongNotFoundException() {
        super();
    }

    public String getMessage() {
        return this.message;
    }
}