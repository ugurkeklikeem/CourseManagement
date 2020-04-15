package com.itbootcamp.coursemanagement.repository;

import com.itbootcamp.coursemanagement.model.entity.Student;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, UUID> {

  Optional<Student> findByEmail(String email);

  List<Student> findAll();

}
