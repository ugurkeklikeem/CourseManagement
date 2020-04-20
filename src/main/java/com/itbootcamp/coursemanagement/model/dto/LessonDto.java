package com.itbootcamp.coursemanagement.model.dto;

import java.util.List;

public class LessonDto {

  private String roomNumber;

  private String duration;

  private Integer courseId;

  private Integer tutorId;

  private List<Integer> studentIds;

  public List<Integer> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
  }

  public Integer getTutorId() {
    return tutorId;
  }

  public void setTutorId(Integer tutorId) {
    this.tutorId = tutorId;
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

  public Integer getCourseId() {
    return courseId;
  }

  public void setCourseId(Integer courseId) {
    this.courseId = courseId;
  }
}
