package espe.edu.service;

import java.util.List;

import espe.edu.entities.Student;

public interface IStudentService {
	public void save(Student student);
	public List<Student> findAll();
	public void delete(Student student);
	
}
