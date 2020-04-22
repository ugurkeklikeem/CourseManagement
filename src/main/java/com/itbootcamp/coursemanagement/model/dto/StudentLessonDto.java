package com.itbootcamp.coursemanagement.model.dto;

public class StudentLessonDto {
  private int lessonId;
  private int studentId;

  public int getLessonId() {
    return lessonId;
  }

  public void setLessonId(int lessonId) {
    this.lessonId = lessonId;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }
}
