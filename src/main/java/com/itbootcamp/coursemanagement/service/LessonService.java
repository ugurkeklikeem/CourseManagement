package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.dto.LessonResponseDto;
import com.itbootcamp.coursemanagement.model.dto.StudentLessonDto;
import java.util.List;

public interface LessonService {

  void addLesson(LessonDto lessonDto);

  List<LessonDto> getAllLessons();

  LessonResponseDto getLessonById(int lessonId);

  void addStudent(StudentLessonDto dto);
}
