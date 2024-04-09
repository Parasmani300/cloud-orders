package com.redchat.Orders.exception;

import com.redchat.Orders.model.ExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OrderControllerException {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionMessage> commonException(Exception ex)
    {
        ExceptionMessage exceptionMessage = new ExceptionMessage(ex.getMessage(),400);
        return new ResponseEntity<>(exceptionMessage,HttpStatus.NOT_FOUND);
    }
}
