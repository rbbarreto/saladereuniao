package com.digital.crud.salareuniao.saladereuniao.exception;

import java.util.Date;

public class ErroDetails {

    private Date timestamp;
    private String message;
    private String details;

    public ErroDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

}
