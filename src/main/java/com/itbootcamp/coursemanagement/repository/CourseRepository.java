package com.itbootcamp.coursemanagement.repository;

import com.itbootcamp.coursemanagement.model.constant.Level;
import com.itbootcamp.coursemanagement.model.entity.Course;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {

  List<Course> findByTitle(String title);

  List<Course> findByLevel(Level level);
}
