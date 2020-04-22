package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.dto.LessonResponseDto;
import com.itbootcamp.coursemanagement.model.dto.StudentLessonDto;
import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.service.LessonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lessons")
public class LessonController {

  @Autowired
  private LessonService lessonService;

  @PostMapping
  public void addLesson(@RequestBody LessonDto lessonDto) {
    lessonService.addLesson(lessonDto);
  }

  @PostMapping("/students")
  public void addStudentToLesson(@RequestBody StudentLessonDto dto) {
    lessonService.addStudent(dto);
  }


  @GetMapping
  public List<LessonDto> getAllLesson() {
    return lessonService.getAllLessons();
  }

  @GetMapping("/{lessonId}")
  public LessonResponseDto getLessonByLessonId(@PathVariable int lessonId) {
    return lessonService.getLessonById(lessonId);
  }
}
