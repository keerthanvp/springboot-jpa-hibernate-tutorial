package com.vpk.tutorial.jpahibernatetutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PassportNotFoundException extends RuntimeException{

    public PassportNotFoundException(String message) {
        super(message);
    }

    public PassportNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
