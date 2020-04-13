package com.itbootcamp.coursemanagement.model.dto;

import com.itbootcamp.coursemanagement.model.constant.Level;
import com.itbootcamp.coursemanagement.model.entity.Student;
import com.itbootcamp.coursemanagement.model.entity.Tutor;

import javax.persistence.*;
import java.util.List;

public class CourseDTO {
    private String title;

    private String description;

    private Level level;

    private Tutor tutor;

    private List<Student> students;

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

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
