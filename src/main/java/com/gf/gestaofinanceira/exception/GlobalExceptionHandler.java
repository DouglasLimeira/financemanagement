package com.gf.gestaofinanceira.exception;

import java.time.Instant;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class GlobalExceptionHandler {
    
    private final MessageSource messageSource; 

    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler (DataAccessException.class)
    public ResponseEntity<ApiError> handleDatabaseConnectionException(DataAccessException exception) {
        String errorMessage = messageSource.getMessage("data.access.exception", null, Locale.getDefault());
        ApiError apiError = buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiError);
    }

    private ApiError buildResponseEntity(HttpStatus status, String errorMessage) {
        ApiError ApiError = new ApiError(Instant.now(), status.value(), status.getReasonPhrase(), errorMessage);
        return ApiError;
    }
}
