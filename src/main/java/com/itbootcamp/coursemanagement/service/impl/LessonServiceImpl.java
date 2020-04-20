package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.entity.Course;
import com.itbootcamp.coursemanagement.model.entity.Lesson;
import com.itbootcamp.coursemanagement.model.entity.Tutor;
import com.itbootcamp.coursemanagement.repository.CourseRepository;
import com.itbootcamp.coursemanagement.repository.LessonRepository;
import com.itbootcamp.coursemanagement.repository.TutorRepository;
import com.itbootcamp.coursemanagement.service.CourseService;
import com.itbootcamp.coursemanagement.service.LessonService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

  @Autowired
  private LessonRepository lessonRepository;

  @Autowired
  private TutorRepository tutorRepository;

  @Override
  public void addLesson(LessonDto lessonDto) {
    Lesson lesson = new Lesson();
    lesson.setLocation(lessonDto.getLocation());
    lesson.setDateAndTime(lessonDto.getDateAndTime());

    Tutor tutor = tutorRepository.findById(lessonDto.getTutorId()).orElseThrow(RuntimeException::new);
    lesson.setTutor(tutor);
    lessonRepository.save(lesson);
  }

  @Override
  public List<LessonDto> getAllLessons() {
    return null;
  }
}