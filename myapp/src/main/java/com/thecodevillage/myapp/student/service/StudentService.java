package com.thecodevillage.myapp.student.service;

import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.student.model.Student;

import java.util.List;

public interface StudentService {

    GenericResponse fetchAllStudents();

    GenericResponse  getStudentById(String studId);

    GenericResponse  saveStudent(Student student);

    GenericResponse  updateStudent(Student student);
}
