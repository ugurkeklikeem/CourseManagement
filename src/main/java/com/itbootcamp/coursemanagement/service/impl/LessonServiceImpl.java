package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.LessonDto;
import com.itbootcamp.coursemanagement.model.dto.LessonResponseDto;
import com.itbootcamp.coursemanagement.model.dto.StudentLessonDto;
import com.itbootcamp.coursemanagement.model.entity.Lesson;
import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.model.entity.Tutor;
import com.itbootcamp.coursemanagement.repository.LessonRepository;
import com.itbootcamp.coursemanagement.repository.StudentRepository;
import com.itbootcamp.coursemanagement.repository.TutorRepository;
import com.itbootcamp.coursemanagement.service.LessonService;
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

  @Autowired
  private StudentRepository studentRepository;

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

  @Override
  public LessonResponseDto getLessonById(int lessonId) {
    LessonResponseDto lessonResponseDto = new LessonResponseDto();
    Optional<Lesson> lessonOptional = lessonRepository.findById(lessonId);
    if(lessonOptional.isPresent()){
      Lesson lesson = lessonOptional.get();
      lessonResponseDto.setLocation(lesson.getLocation());
      lessonResponseDto.setDateAndTime(lesson.getDateAndTime());
      lessonResponseDto.setTutor(lesson.getTutor());
      lessonResponseDto.setStudents(lesson.getStudents());
    }

    return lessonResponseDto;
  }

  @Override
  public void addStudent(StudentLessonDto dto) {
    Lesson lesson = lessonRepository.findById(dto.getLessonId()).
        orElseThrow(RuntimeException::new);

    Student student = studentRepository.findById(dto.getStudentId()).
        orElseThrow(RuntimeException::new);

    lesson.getStudents().add(student);
    lessonRepository.save(lesson);
  }
}
