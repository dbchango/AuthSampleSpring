package espe.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import espe.edu.entities.Student;
import espe.edu.repository.IStudentRep;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private IStudentRep dao;
	
	@Override
	public void save(Student student) {
		dao.save(student);
		
	}

	@Override
	public List<Student> findAll() {
		return (List<Student>)dao.findAll();
			}

	@Override
	public void delete(Student student) {
		dao.delete(student);
		
	}
	
}
