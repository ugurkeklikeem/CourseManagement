package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    public void addCourse(CourseDTO courseDTO);

    public List<CourseDTO> getAllCourse();

    public List<CourseDTO> getCourseByTitle(String title);
}
