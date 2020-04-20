package com.itbootcamp.coursemanagement.model.dto;

public class LessonDto {
  private String location;
  private String dateAndTime;
  private int tutorId;

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

  public int getTutorId() {
    return tutorId;
  }

  public void setTutorId(int tutorId) {
    this.tutorId = tutorId;
  }
}
