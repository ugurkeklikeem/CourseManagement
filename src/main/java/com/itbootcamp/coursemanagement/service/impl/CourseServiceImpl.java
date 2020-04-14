package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.entity.Course;
import com.itbootcamp.coursemanagement.repository.CourseRepository;
import com.itbootcamp.coursemanagement.service.CourseService;
import com.sun.org.apache.xpath.internal.objects.XBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void addCourse(CourseDTO courseDTO) {
        Course course = new Course(courseDTO.getTitle(), courseDTO.getDescription(), courseDTO.getLevel());
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
            courseDTO.setStudents(course.getStudents());
            courseDTO.setTutor(course.getTutor());
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
            courseDTO.setStudents(course.getStudents());
            courseDTO.setTutor(course.getTutor());
            courseDTOS.add(courseDTO);
        });
        return courseDTOS;

    }

    @Override
    public boolean deleteCourse(Integer id) {
        Optional<Course> deletecourse = courseRepository.findById(id);
        if (deletecourse.isPresent()) {
            courseRepository.delete(deletecourse.get());
            return true;
        } else
            return false;
    }

    @Override
    public boolean updateCourse(Integer id, CourseDTO courseDTO) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if (courseOptional.isPresent()) {
            Course course = courseOptional.get();
            course.setTitle(courseDTO.getTitle());
            course.setDescription(courseDTO.getDescription());
            course.setLevel(courseDTO.getLevel());
            course.setStudents(courseDTO.getStudents());
            course.setTutor(courseDTO.getTutor());
            return true;
        } else
            return false;

    }

}


