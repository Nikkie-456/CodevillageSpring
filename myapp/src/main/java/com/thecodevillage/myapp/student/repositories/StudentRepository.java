package com.thecodevillage.myapp.student.repositories;

import com.thecodevillage.myapp.student.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {

    List<Student> fetchAllStudents();

    Optional<Student> findStudentById(@Param("studId") String studId);
}
