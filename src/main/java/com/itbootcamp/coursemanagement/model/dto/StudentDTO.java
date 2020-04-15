package com.itbootcamp.coursemanagement.model.dto;

import com.itbootcamp.coursemanagement.model.entity.Course;
import java.util.Date;
import java.util.List;

public class StudentDTO {
  private String name;
  private String surname;
  private Date dateOfBirth ;
  private String email;
  private String password;
  private List<CourseDTO> courses;

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

  public List<CourseDTO> getCourses() {
    return courses;
  }

  public void setCourses(List<CourseDTO> courses) {
    this.courses = courses;
  }
}
