package xv.training.springbootexample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xv.training.springbootexample1.entities.Organisation;
import xv.training.springbootexample1.entities.Student;
import xv.training.springbootexample1.repositories.OrganisationRepository;
import xv.training.springbootexample1.repositories.StudentRepository;

@SpringBootApplication
public class Springbootexample1Application {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private OrganisationRepository organisationRepository;


	public static void main(String[] args) {
		SpringApplication.run(Springbootexample1Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
	return args -> {
		Organisation organisation1 = new Organisation("Organisation1", "This is first organisation");
		Organisation organisation2 = new Organisation("Organisation2", "This is second organisation");
		Organisation organisation3 = new Organisation("Organisation3", "This is third organisation");
		organisationRepository.save(organisation1);
		organisationRepository.save(organisation2);
		organisationRepository.save(organisation3);
		
		studentRepository.save(new Student("Srinivas", "Male", "BE", 25,organisation2));
		studentRepository.save(new Student("Sushma", "Female", "BTECH", 21,organisation1));
		studentRepository.save(new Student("Swetha", "Female", "BTECH", 20,organisation3));
		studentRepository.save(new Student("Sujatha", "Female", "BE", 28,organisation2));
		studentRepository.save(new Student("Sudarshan", "Male", "BE", 29,organisation1));

		
	};

	}

}
