package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.StudentDto;
import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.repository.StudentRepository;
import com.itbootcamp.coursemanagement.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private StudentRepository studentRepository;

  public StudentServiceImpl(
      StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public void addStudent(StudentDto studentDto) {
    Student student = new Student();
    student.setName(studentDto.getName());
    student.setStudentNumber(studentDto.getStudentNumber());
    studentRepository.save(student);
  }

  @Override
  public List<StudentDto> getAllStudents() {
    List<StudentDto> studentDtoList = new ArrayList<>();
    studentRepository.findAll().forEach(student -> {
      StudentDto studentDto = new StudentDto();
      student.setName(student.getName());
      student.setStudentNumber(student.getStudentNumber());
      studentDtoList.add(studentDto);
    });
    return studentDtoList;
  }

  @Override
  public List<StudentDto> getAllStudentByName(String name) {
    List<StudentDto> studentDtoList = new ArrayList<>();
    studentRepository.findByName(name).forEach(student -> {
      StudentDto studentDto = new StudentDto();
      student.setName(student.getName());
      student.setStudentNumber(student.getStudentNumber());
      studentDtoList.add(studentDto);
    });
    return studentDtoList;
  }
}
