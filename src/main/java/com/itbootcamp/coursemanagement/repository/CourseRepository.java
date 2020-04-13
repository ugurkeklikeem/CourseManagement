package com.itbootcamp.coursemanagement.repository;

import com.itbootcamp.coursemanagement.model.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    public List<Course> findByTitle(String title);
}
