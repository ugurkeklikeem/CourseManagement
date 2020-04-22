package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.dto.StudentDto;
import com.itbootcamp.coursemanagement.service.CourseService;
import com.itbootcamp.coursemanagement.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

  private StudentService studentService;
  @Autowired
  private CourseService courseService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping
  public void addStudent(@RequestBody StudentDto studentDto) {
    studentService.addStudent(studentDto);
  }

  @GetMapping
  public List<StudentDto> getAllCourse() {
    return studentService.getAllStudents();
  }

  @GetMapping("/name/{name}")
  public List<StudentDto> getCourseByName(@PathVariable String name) {
    return studentService.getAllStudentByName(name);
  }

}
