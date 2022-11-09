package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

//This interface has all the methods related to database operations 

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
