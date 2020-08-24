package com.thecodevillage.myapp.student.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Table(name="mst_student")
@NamedQueries({@NamedQuery(name = "Student.fetchAllStudents",query = "select s from Student s")})
@NamedQuery(name = "Student.findStudentById",query = "select s from Student s where s.studId= :studId")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String studId;
    private String studName;
    private String roomNo;

    public Student(){}

    public Student(long id, String studId, String studName, String roomNo) {
        this.id = id;
        this.studId = studId;
        this.studName = studName;
        this.roomNo = roomNo;
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

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
