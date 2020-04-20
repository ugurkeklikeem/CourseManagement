package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.entity.Course;
import com.itbootcamp.coursemanagement.model.entity.Lesson;
import com.itbootcamp.coursemanagement.model.entity.Tutor;
import com.itbootcamp.coursemanagement.repository.CourseRepository;
import com.itbootcamp.coursemanagement.repository.LessonRepository;
import com.itbootcamp.coursemanagement.repository.TutorRepository;
import com.itbootcamp.coursemanagement.service.LessonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

  @Autowired
  private LessonRepository lessonRepository;

  @Autowired
  private CourseRepository courseRepository;

  @Autowired
  private TutorRepository tutorRepository;

  @Override
  public void addLesson(LessonDto lessonDto) {
    Course course = courseRepository.findById(lessonDto.getCourseId()).orElseThrow( RuntimeException::new);
    Tutor tutor = tutorRepository.findById(lessonDto.getTutorId()).orElseThrow( RuntimeException::new);

    Lesson lesson = new Lesson();
    lesson.setRoomNumber(lessonDto.getRoomNumber());
    lesson.setDuration(lessonDto.getDuration());
    lesson.setCourse(course);
    lesson.addTutor(tutor);
    lessonRepository.save(lesson);
  }

  @Override
  public List<Lesson> getAllLessons() {
    return lessonRepository.findAll();
  }
}
