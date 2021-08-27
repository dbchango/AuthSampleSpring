package espe.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import espe.edu.entities.Student;
import espe.edu.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService service;
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student) {
		service.save(student);
		return student;
	}
	@GetMapping("")
	public List<Student> list() {
		return service.findAll();
	}
	
	
}
