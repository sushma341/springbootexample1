package xv.training.springbootexample1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import xv.training.springbootexample1.entities.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student>findByName(@Param("name") String name);
}
