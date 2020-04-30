package com.itbootcamp.coursemanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class GloabalExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity handleRuntimeExceptions(RuntimeException e){
    return ResponseEntity.badRequest().body( e.getMessage());
  }

}
