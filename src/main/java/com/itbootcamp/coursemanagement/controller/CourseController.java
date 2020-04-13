package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.service.CourseService;
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
@RequestMapping("courses")
public class CourseController {

  @Autowired
  private CourseService courseService;

  @PostMapping
  public ResponseEntity addCourse(@RequestBody CourseDTO courseDTO) {
    courseService.addCourse(courseDTO);
    return new ResponseEntity("Course added", HttpStatus.OK);
  }

  @PutMapping("/{courseId}")
  public void updateCourse(@RequestBody CourseDTO courseDTO, @PathVariable Integer courseId) {
    courseService.updateCourse(courseId, courseDTO);
  }

  @GetMapping
  public List<CourseDTO> getAllCourse() {
    return courseService.getAllCourse();
  }

  @GetMapping("/title/{title}")
  public List<CourseDTO> getCourseByTitle(@PathVariable String title) {
    return courseService.getCourseByTitle(title);
  }

  @DeleteMapping("/{courseId}")
  public void getCourseByTitle(@PathVariable Integer courseId) {
    courseService.deleteByCourseId(courseId);
  }
}
