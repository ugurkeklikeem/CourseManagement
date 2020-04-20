package com.itbootcamp.coursemanagement.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Tutor {

  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;

  @OneToOne(mappedBy = "tutor", cascade = CascadeType.ALL)
  private TutorContact contact;

  @OneToMany(mappedBy = "tutor", fetch = FetchType.LAZY)
  private List<Lesson> lessons = new ArrayList<>();

  public void setTutorContact(TutorContact contact){
    contact.setTutor(this);
    this.contact = contact;
  }

  public void removeTutorContact(){
    contact.setTutor(null);
    this.contact = null;
  }

  public void addLesson(Lesson lesson){
    lesson.setTutor(this);
    lessons.add(lesson);
  }

  public void removeLesson(Lesson lesson){
    lesson.setTutor(null);
    lessons.remove(lesson);
  }

  public TutorContact getContact() {
    return contact;
  }

  public void setContact(TutorContact contact) {
    this.contact = contact;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
