package xv.training.springbootexample1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.springbootexample1.entities.Student;
import xv.training.springbootexample1.repositories.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/students")
	public Iterable<Student> getStudents() {
		return studentRepository.findAll();
	}
}
