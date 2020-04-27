package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.StudentDto;
import com.itbootcamp.coursemanagement.model.dto.StudentLessonDto;

import java.util.List;

public interface StudentService {

  void addStudent(StudentDto studentDto);

  List<StudentDto> getAllStudents();

  List<StudentDto> getAllStudentByName(String name);

  void addLesson(StudentLessonDto dto);
}
