package xv.training.springbootexample1.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Organisation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long organisationid;
	private  String organisationname,organisationdesc;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="organisation")
	private List<Student> students;
	
	public Organisation() {
		
	}
	
	
	public Organisation(String organisationname, String organisationdesc) {
		super();
		this.organisationname = organisationname;
		this.organisationdesc = organisationdesc;
	}


	
	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

	

	public long getOrganisationid() {
		return organisationid;
	}


	public void setOrganisationid(long organisationid) {
		this.organisationid = organisationid;
	}


	public String getOrganisationname() {
		return organisationname;
	}
	public void setOrganisationname(String organisationname) {
		this.organisationname = organisationname;
	}
	public String getOrganisationdesc() {
		return organisationdesc;
	}
	public void setOrganisationdesc(String organisationdesc) {
		this.organisationdesc = organisationdesc;
	}
	
	
}
