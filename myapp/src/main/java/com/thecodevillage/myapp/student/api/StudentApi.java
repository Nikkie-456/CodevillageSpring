package com.thecodevillage.myapp.student.api;


import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.student.model.Student;
import com.thecodevillage.myapp.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentApi {

    private StudentService studentService;
    @Autowired
    public StudentApi(StudentService studentService){this.studentService=studentService;}

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity createStudent(@RequestBody Student student){
        try{
            System.out.println("Create New Student");
            System.out.println("Student Name: " +student.getStudName());
            Object genericResponse=studentService.saveStudent(student);
            return new ResponseEntity<>(genericResponse, HttpStatus.OK);}
        catch (Exception h){
            System.out.println("Error while creating Student.");
        }
        return null;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ResponseEntity viewStudents() {
        System.out.println("Fetch Students from  Database ");

        Object genericResponse = studentService.fetchAllStudents();
        return new ResponseEntity<>(genericResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public ResponseEntity editStudent(@RequestBody Student student){
        try{
            System.out.println("Edit Student Details");
            System.out.println("Student Name: " +student.getStudName());
            Object genericResponse= studentService.updateStudent(student);
            return new ResponseEntity<>(genericResponse, HttpStatus.OK);}
        catch (Exception h){
            System.out.println("Error while updating Student Details.");
        }
        return null;
    }
}
