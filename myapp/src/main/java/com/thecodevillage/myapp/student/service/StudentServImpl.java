package com.thecodevillage.myapp.student.service;

import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.student.model.Student;
import com.thecodevillage.myapp.student.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServImpl implements StudentService{

    private StudentRepository studentRepository;

     @Autowired
    public StudentServImpl(StudentRepository studentRepository){this.studentRepository=studentRepository;}


    @Override
    public GenericResponse fetchAllStudents() {
        List<Student> student = studentRepository.fetchAllStudents();
        if (student.size()> 0){
            return new GenericResponse(2002, "Data Fetched Successful",student);}
        return new GenericResponse(2006, "Error Fetching Data");
    }

    @Override
    public GenericResponse getStudentById(String studId) {
        return null;
    }


    @Override
    public GenericResponse saveStudent(Student student) {
        Student student1 = studentRepository.save(student);
        if (student.getId() > 0){
            return new GenericResponse(2002, "Updations Are Successful",student1);}
        return new GenericResponse(2006, "Error Updating Room");
    }

    @Override
    public GenericResponse updateStudent(Student student) {
        Student student1 = studentRepository.save(student);
        if (student.getId() > 0){
            return new GenericResponse(2002, "Updations Are Successful",student1);}
        return new GenericResponse(2006, "Error Updating Room");
    }
}
