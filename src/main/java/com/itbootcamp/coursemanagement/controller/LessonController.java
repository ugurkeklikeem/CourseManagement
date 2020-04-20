package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.entity.Lesson;
import com.itbootcamp.coursemanagement.service.LessonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lessons")
public class LessonController {

  @Autowired
  private LessonService lessonService;

  @PostMapping
  public void addLesson(@RequestBody LessonDto lesson) {
    lessonService.addLesson(lesson);
  }
//
//  @PutMapping("/{courseId}")
//  public void updateCourse(@RequestBody CourseDTO courseDTO, @PathVariable Integer courseId) {
//    lessonService.updateCourse(courseId, courseDTO);
//  }
//
  @GetMapping
  public List<Lesson> getAllLessons() {
    return lessonService.getAllLessons();
  }
//
//  @GetMapping("/title/{title}")
//  public List<CourseDTO> getCourseByTitle(@PathVariable String title) {
//    return lessonService.getCourseByTitle(title);
//  }
//
//  @DeleteMapping("/{courseId}")
//  public void getCourseByTitle(@PathVariable Integer courseId) {
//    lessonService.deleteByCourseId(courseId);
//  }
}
