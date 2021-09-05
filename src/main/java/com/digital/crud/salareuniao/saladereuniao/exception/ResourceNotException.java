package com.digital.crud.salareuniao.saladereuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotException extends Exception {

    private static final long  serialVersionUID = 1L;;

    public ResourceNotException(String message){
        super(message);
    }

}
