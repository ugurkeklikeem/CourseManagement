package com.itbootcamp.coursemanagement.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

  @Id
  @GeneratedValue
  private Integer id;

  private String name;

  private String studentNumber;

  @ManyToMany( mappedBy = "students")
  private List<Lesson> lessons = new ArrayList<>();

  public List<Lesson> getLessons() {
    return lessons;
  }

  public void setLessons(List<Lesson> lessons) {
    this.lessons = lessons;
  }

  public void addLesson(Lesson lesson){
    lesson.getStudents().add(this);
    lessons.add(lesson);
  }
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
  }
}
