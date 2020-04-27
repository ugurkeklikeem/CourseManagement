package com.itbootcamp.coursemanagement.model.dto;

import com.itbootcamp.coursemanagement.model.constant.Level;

public class CourseDTO {

  private String title;

  private String description;

  private Level level;

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

  public void setLevel(Level level) {
    this.level = level;
  }
}
