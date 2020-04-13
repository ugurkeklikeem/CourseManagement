package com.itbootcamp.coursemanagement.model.entity;

import com.itbootcamp.coursemanagement.model.constant.Level;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private String title;

  @Column
  private String description;

  @Column
  private Level level;

  public Course() {
  }

  public Course(String title, String description, Level level) {
    this.title = title;
    this.description = description;
    this.level = level;

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Level getLevel() {
    return level;
  }
}
