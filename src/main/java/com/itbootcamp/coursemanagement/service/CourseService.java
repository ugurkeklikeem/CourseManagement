package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.entity.Course;
import java.util.List;

public interface CourseService {

  void addCourse(CourseDTO courseDTO);

  List<CourseDTO> getAllCourse();

  List<CourseDTO> getCourseByTitle(String title);

  void deleteByCourseId(Integer courseId);

  void updateCourse(Integer courseId,CourseDTO courseDTO);

  List<Course> getCoursesByTitleOrderByTitle(String title);
}
