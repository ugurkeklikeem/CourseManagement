package com.itbootcamp.coursemanagement.repository;

import com.itbootcamp.coursemanagement.model.entity.Lesson;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Integer> {

  @Query(value = "elect * from lesson", nativeQuery = true)
  Lesson nativeQueryExample();
}
