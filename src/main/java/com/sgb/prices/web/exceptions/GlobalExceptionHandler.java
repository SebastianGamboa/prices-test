package com.sgb.prices.web.exceptions;

import com.sgb.prices.web.dtos.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {ResourceNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseError resourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseError(ex.getMessage());
    }
}
