package com.itbootcamp.coursemanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Lesson {

  @Id
  @GeneratedValue
  private Integer id;

  private String roomNumber;

  private String duration;

  @OneToOne
  @JoinColumn(name = "course_id")
  private Course course;

  @ManyToMany
  private List<Tutor> tutors = new ArrayList<>();

  public void addTutor(Tutor tutor){
    tutors.add(tutor);
    tutor.getLessons().add(this);
  }

  public void removeTutor(Tutor tutor){
    tutors.remove(tutor);
    tutor.getLessons().remove(this);
  }

  public List<Tutor> getTutors() {
    return tutors;
  }

  public void setTutors(List<Tutor> tutors) {
    this.tutors = tutors;
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }
}
