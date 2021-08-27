package espe.edu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import espe.edu.entities.ERole;
import espe.edu.entities.Role;

@Repository
public interface IRole extends JpaRepository<Role, Long>{
	Optional<Role> findByName(ERole name);
}
