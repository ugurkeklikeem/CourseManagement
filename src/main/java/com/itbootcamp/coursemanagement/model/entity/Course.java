package com.itbootcamp.coursemanagement.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private String title;

  @Column
  private String description;

  @ManyToOne
  @JoinColumn(name = "STUDENT_ID")
  private Student student;

}
