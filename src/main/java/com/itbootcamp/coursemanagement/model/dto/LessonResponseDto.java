package com.itbootcamp.coursemanagement.model.dto;

import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.model.entity.Tutor;
import java.util.ArrayList;
import java.util.List;

public class LessonResponseDto {
  private String location;
  private String dateAndTime;
  private Tutor tutor;

  public Tutor getTutor() {
    return tutor;
  }

  public void setTutor(Tutor tutor) {
    this.tutor = tutor;
  }

  private List<Student> students = new ArrayList<>();

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getDateAndTime() {
    return dateAndTime;
  }

  public void setDateAndTime(String dateAndTime) {
    this.dateAndTime = dateAndTime;
  }

}
