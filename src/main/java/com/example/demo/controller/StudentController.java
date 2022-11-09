package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

//REST APIs to post and fetch the data

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class StudentController {
	
	@Autowired
	private StudentRepository studentrepository;
	
	// get all student survey details
		@GetMapping("/student")
		public List<Student> getAllstudentdetails(){
			return studentrepository.findAll();
		}
		
   // Create Rest API to carry the form data
		
		@PostMapping("/student")
		 public Student createStudent(@RequestBody Student student)
		 {
			return studentrepository.save(student);
		 }
		
	// Creating Rest API for getting student details by id
		@GetMapping("/student/{id}")
		public ResponseEntity<Student> getEmployeeById(@PathVariable Long id) {
			Student student = studentrepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
			return ResponseEntity.ok(student);
		}

}
