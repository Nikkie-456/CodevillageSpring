package com.thecodevillage.myapp.student.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Table(name="mst_student")
@NamedQueries({@NamedQuery(name = "Student.fetchAllStudents",query = "select s from Student s")})

public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String studId;
    private String studName;

    public Student(){}

    public Student(long id, String studId, String studName) {
        this.id = id;
        this.studId = studId;
        this.studName = studName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }
}
