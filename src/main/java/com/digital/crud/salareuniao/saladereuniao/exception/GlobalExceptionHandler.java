package com.digital.crud.salareuniao.saladereuniao.exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConfigDataResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ConfigDataResourceNotFoundException ex, WebRequest request){
        ErroDetails erroDetails = new ErroDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(erroDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?>globalExceptionHandle(Exception ex, WebRequest request){
        ErroDetails erroDetails=new ErroDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(erroDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
