package com.itbootcamp.coursemanagement.model.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
  @Id
  private UUID id;
  private String name;
  private String surname;
  private Date dateOfBirth ;
  private String email;
  private String password;
  private List<Course> courses;
  private Course course;

  public Student(UUID id, String name, String surname, Date dateOfBirth,
      String email, String password,
      List<Course> courses, Course course) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.dateOfBirth = dateOfBirth;
    this.email = email;
    this.password = password;
    this.courses = courses;
    this.course = course;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }
}
