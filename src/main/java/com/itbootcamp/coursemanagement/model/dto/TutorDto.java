package com.itbootcamp.coursemanagement.model.dto;

import com.itbootcamp.coursemanagement.model.entity.TutorContact;

public class TutorDto {

  private String firstName;

  private String lastName;

  private String email;

  private TutorContact contact;

  public TutorContact getContact() {
    return contact;
  }

  public void setContact(TutorContact contact) {
    this.contact = contact;
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
