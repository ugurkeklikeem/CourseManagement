package com.itbootcamp.coursemanagement.service;

import com.itbootcamp.coursemanagement.model.dto.TutorDto;
import java.util.List;

public interface TutorService {

  void addTutor(TutorDto tutorDto);

  List<TutorDto> getAllTutors();

  List<TutorDto> getTutorByEmail(String email);
}
