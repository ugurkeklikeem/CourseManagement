package com.itbootcamp.coursemanagement.repository;

import com.itbootcamp.coursemanagement.model.entity.Lesson;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {

  List<Lesson> findByCourseId(String courseId);

  List<Lesson> findAll();
}
