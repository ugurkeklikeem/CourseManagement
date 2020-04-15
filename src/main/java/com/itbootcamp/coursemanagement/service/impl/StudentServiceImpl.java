package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.StudentDTO;
import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.repository.StudentRepository;
import com.itbootcamp.coursemanagement.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public void addStudent(StudentDTO studentDTO) {
    if (!studentRepository.findByEmail(studentDTO.getEmail()).isPresent()) {
      Student student = new Student(UUID.randomUUID(), studentDTO.getName(),
          studentDTO.getSurname(),
          studentDTO.getDateOfBirth(), studentDTO.getEmail(), studentDTO.getPassword());
      studentRepository.save(student);
    }
  }

  @Override
  public List<StudentDTO> getStudents() {
    List<StudentDTO> studentDTOList = new ArrayList<>();
    ModelMapper modelMapper = new ModelMapper();
    studentRepository.findAll().forEach(student -> {
      StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);
      studentDTOList.add(studentDTO);
    });
    return studentDTOList;
  }

}
