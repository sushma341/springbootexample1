package xv.training.springbootexample1.repositories;

import org.springframework.data.repository.CrudRepository;

import xv.training.springbootexample1.entities.Organisation;

public interface OrganisationRepository extends CrudRepository<Organisation, Long> {

}
