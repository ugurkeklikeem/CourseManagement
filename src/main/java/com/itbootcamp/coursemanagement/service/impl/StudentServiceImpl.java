package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.StudentDto;
import com.itbootcamp.coursemanagement.model.dto.StudentLessonDto;
import com.itbootcamp.coursemanagement.model.entity.Lesson;
import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.repository.LessonRepository;
import com.itbootcamp.coursemanagement.repository.StudentRepository;
import com.itbootcamp.coursemanagement.service.StudentService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private StudentRepository studentRepository;


  private LessonRepository lessonRepository;


  public StudentServiceImpl(
      StudentRepository studentRepository, LessonRepository lessonRepository) {
    this.lessonRepository = lessonRepository;
    this.studentRepository = studentRepository;
  }

  @Override
  public void addStudent(StudentDto studentDto) {
    Student student = new Student();
    student.setName(studentDto.getName());
    student.setStudentNumber(student.getStudentNumber());
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

  @Override
  public void addLesson(StudentLessonDto dto) {
    Student student = studentRepository.findById(dto.getStudentId()).
            orElseThrow(RuntimeException::new);

    Lesson lesson = lessonRepository.findById(dto.getLessonId()).
            orElseThrow(RuntimeException::new);

    student.getLessons().add(lesson);
    studentRepository.save(student);
  }
}
