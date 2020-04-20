package com.itbootcamp.coursemanagement.controller;

import com.itbootcamp.coursemanagement.model.dto.CourseDTO;
import com.itbootcamp.coursemanagement.model.dto.TutorDto;
import com.itbootcamp.coursemanagement.model.entity.Tutor;
import com.itbootcamp.coursemanagement.repository.TutorRepository;
import com.itbootcamp.coursemanagement.service.TutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tutors")
public class TutorController {
  private TutorService tutorService;
  @Autowired
  private TutorRepository tutorRepository;
  public TutorController(TutorService tutorService) {
    this.tutorService = tutorService;
  }

  @GetMapping("{tutorEmail}")
  public List<TutorDto> getTutorsByEmail(@PathVariable String tutorEmail){
    return tutorService.getTutorByEmail(tutorEmail);
  }

  @GetMapping
  public List<TutorDto> getAll(){
    return tutorService.getAllTutors();
  }

  @PostMapping
  public void addTutor(@RequestBody TutorDto tutorDto){
    tutorService.addTutor(tutorDto);
  }

  @DeleteMapping("{tutorId}")
  public void addTutor(@PathVariable Integer tutorId){
    tutorRepository.deleteById(tutorId);
  }
}
