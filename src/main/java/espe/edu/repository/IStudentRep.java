package espe.edu.repository;

import javax.persistence.EntityManager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import espe.edu.entities.Student;


@Repository
public interface IStudentRep extends CrudRepository<Student, Long>{
	
	
}
