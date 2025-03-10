package com.prac.ride.exception;

import com.prac.ride.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public ResponseEntity<ErrorResponse> handleAuthException(AuthException e){

        ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), e.getCause().toString());
        log.error("Authentication Exception ",e);
        return new ResponseEntity<>(errorResponse,HttpStatus.UNAUTHORIZED);
    }

}
