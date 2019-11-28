package xv.training.springbootexample1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.springbootexample1.entities.Organisation;
import xv.training.springbootexample1.repositories.OrganisationRepository;

@RestController
public class OrganisationContoller {

	@Autowired
	private OrganisationRepository organisationRepository;

	@RequestMapping("/organisations")
	public Iterable<Organisation> getorganisations() {
		return organisationRepository.findAll();
	}
}
