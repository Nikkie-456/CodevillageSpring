package com.thecodevillage.myapp.student.service;

import com.thecodevillage.myapp.student.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> fetchAllStudents();

    Student getStudentById(String studId);

    Student saveStudent(Student student);

    Student updateStudent(Student student);
}
