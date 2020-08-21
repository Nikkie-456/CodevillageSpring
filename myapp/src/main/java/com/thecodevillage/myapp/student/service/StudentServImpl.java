package com.thecodevillage.myapp.student.service;

import com.thecodevillage.myapp.student.model.Student;
import com.thecodevillage.myapp.student.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServImpl(StudentRepository studentRepository){this.studentRepository=studentRepository;}


    @Override
    public List<Student> fetchAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(String studId) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}
