package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.constant.Level;
import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.entity.Course;
import com.itbootcamp.coursemanagement.repository.CourseRepository;
import com.itbootcamp.coursemanagement.service.CourseService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

  @Autowired
  private CourseRepository courseRepository;

  @Override
  public void addCourse(CourseDTO courseDTO) {
    Course course = new Course(courseDTO.getTitle(), courseDTO.getDescription(),
        courseDTO.getLevel());
    courseRepository.save(course);
  }

  @Override
  public List<CourseDTO> getAllCourse() {
    List<CourseDTO> courseDTOS = new ArrayList<>();
    courseRepository.findAll().forEach(course -> {
      CourseDTO courseDTO = new CourseDTO();
      courseDTO.setDescription(course.getDescription());
      courseDTO.setLevel(course.getLevel());
      courseDTO.setTitle(course.getTitle());
      courseDTOS.add(courseDTO);
    });
    return courseDTOS;
  }

  @Override
  public List<CourseDTO> getCourseByTitle(String title) {
    List<CourseDTO> courseDTOS = new ArrayList<>();
    courseRepository.findByTitle(title).forEach(course -> {
      CourseDTO courseDTO = new CourseDTO();
      courseDTO.setDescription(course.getDescription());
      courseDTO.setLevel(course.getLevel());
      courseDTO.setTitle(course.getTitle());
      courseDTOS.add(courseDTO);
    });
    return courseDTOS;
  }

  @Override
  public void deleteByCourseId(Integer courseId) {
    courseRepository.deleteById(courseId);
  }

  @Override
  public void updateCourse(Integer courseId, CourseDTO courseDTO) {
    Optional<Course> courseOptional = courseRepository.findById(courseId);
    courseOptional.ifPresent(course -> {
      course.setTitle(courseDTO.getTitle());
      course.setDescription(courseDTO.getDescription());
      courseRepository.save(course);
    });
  }

  @Override
  public List<CourseDTO> getCourseByLevel(Level level) {
    List<Course> courseList = courseRepository.findByLevel(level);
    List<CourseDTO> courseDTOS = new ArrayList<>();
    courseList.forEach(course -> {
      CourseDTO courseDTO = new CourseDTO();
      courseDTO.setDescription(course.getDescription());
      courseDTO.setLevel(course.getLevel());
      courseDTO.setTitle(course.getTitle());
      courseDTOS.add(courseDTO);
    });
    return courseDTOS;
  }
}
