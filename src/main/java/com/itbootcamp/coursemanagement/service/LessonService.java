package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import java.util.List;

public interface LessonService {

  void addLesson(LessonDto lessonDto);

  List<LessonDto> getAllLessons();
}
