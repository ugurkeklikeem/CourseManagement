package com.itbootcamp.coursemanagement.repository;

import com.itbootcamp.coursemanagement.model.entity.Student;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

  List<Student> findByName(String name);
}
