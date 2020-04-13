package com.itbootcamp.coursemanagement.model.entity;

import com.itbootcamp.coursemanagement.model.constant.Level;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;


    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Student> students;

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
