package com.cacoalpano.apicommon.exceptions;

import com.cacoalpano.apicommon.model.core.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionsHandle extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MessageResponse> handleAllExceptions(Exception ex, WebRequest request) {
        MessageResponse error = new MessageResponse(500, ex.getMessage());
        return new ResponseEntity<MessageResponse>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MessageResponse handleBadRequest(BadRequestException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        return new MessageResponse(400, details.get(0));
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MessageResponse handleNotFound(NotFoundException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        return new MessageResponse(404, details.get(0));
    }

    @ExceptionHandler(AccessDenieException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public MessageResponse handleAccessDenie(AccessDenieException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        return new MessageResponse(403, details.get(0));
    }

    @ExceptionHandler(UnauthorizedAccessException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public MessageResponse handleAccessDenie(UnauthorizedAccessException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        return new MessageResponse(401, details.get(0));
    }
}

