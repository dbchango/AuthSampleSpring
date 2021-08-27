package espe.edu.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name="Students")
@Entity
public class Student implements Serializable {
	@Id
	@Column(name="id_student")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idStudent;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	public Student(Long idStudent) {
		this.idStudent=idStudent;
	}
	public Student() {
		
	}
	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
