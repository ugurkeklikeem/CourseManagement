package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@Controller
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity addCourse(@RequestBody CourseDTO courseDTO){
       courseService.addCourse(courseDTO);
       return new ResponseEntity("Course added", HttpStatus.OK);
    }

    @GetMapping
    public List<CourseDTO> getAllCourse () { return courseService.getAllCourse(); }

    @GetMapping("/title/{title}")
    public List<CourseDTO> getCourseByTitle(@PathVariable String title) {
       return courseService.getCourseByTitle(title);
    }

}
