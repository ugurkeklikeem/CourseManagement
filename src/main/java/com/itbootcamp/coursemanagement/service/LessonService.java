package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.entity.Lesson;
import java.util.List;

public interface LessonService {

  void addLesson(LessonDto lessonDto);

  List<Lesson> getAllLessons();
}
