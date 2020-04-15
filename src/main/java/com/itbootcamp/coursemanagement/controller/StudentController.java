package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.StudentDTO;
import com.itbootcamp.coursemanagement.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @PostMapping
  public ResponseEntity registerStudent(@RequestBody StudentDTO studentDTO) {
    studentService.addStudent(studentDTO);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping
  public List<StudentDTO> getAllStudents() {
    return studentService.getStudents();
  }

}

