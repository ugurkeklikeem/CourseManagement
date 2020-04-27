package com.itbootcamp.coursemanagement.service.impl;

import com.itbootcamp.coursemanagement.model.dto.TutorDto;
import com.itbootcamp.coursemanagement.model.entity.Tutor;
import com.itbootcamp.coursemanagement.repository.TutorRepository;
import com.itbootcamp.coursemanagement.service.TutorService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TutorServiceImpl implements TutorService {

  private TutorRepository tutorRepository;

  public TutorServiceImpl(
      TutorRepository tutorRepository) {
    this.tutorRepository = tutorRepository;
  }

  @Override
  public void addTutor(TutorDto tutorDto) {
    Tutor tutor = new Tutor();
    tutor.setEmail(tutorDto.getEmail());
    tutor.setFirstName(tutorDto.getFirstName());
    tutor.setLastName(tutorDto.getLastName());
    tutor.setTutorContact(tutorDto.getContact());
    tutorRepository.save(tutor);
  }

  @Override
  public List<TutorDto> getAllTutors() {
    List<TutorDto> tutorDtoList = new ArrayList<>();
    tutorRepository.findAll().forEach(tutor -> {
      TutorDto tutorDto = new TutorDto();
      tutorDto.setEmail(tutor.getEmail());
      tutorDto.setFirstName(tutor.getFirstName());
      tutorDto.setLastName(tutor.getLastName());
      tutorDtoList.add(tutorDto);
    });
    return tutorDtoList;
  }

  @Override
  public List<TutorDto> getTutorByEmail(String email) {
    List<TutorDto> tutorDtoList = new ArrayList<>();
    tutorRepository.findByEmail(email).forEach(tutor -> {
      TutorDto tutorDto = new TutorDto();
      tutorDto.setEmail(tutor.getEmail());
      tutorDto.setFirstName(tutor.getFirstName());
      tutorDto.setLastName(tutor.getLastName());
      tutorDtoList.add(tutorDto);
    });
    return tutorDtoList;
  }
}
