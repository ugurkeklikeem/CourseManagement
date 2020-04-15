package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.StudentDTO;
import java.util.List;

public interface StudentService {

  public void addStudent(StudentDTO studentDTO);

  public List<StudentDTO> getStudents();
}
