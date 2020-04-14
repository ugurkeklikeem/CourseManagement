package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseService {
    public void addCourse(CourseDTO courseDTO);

    public List<CourseDTO> getAllCourse();

    public List<CourseDTO> getCourseByTitle(String title);

    public boolean deleteCourse(Integer id);

    public boolean updateCourse(Integer id, CourseDTO courseDTO);
}
