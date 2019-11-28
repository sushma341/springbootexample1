package xv.training.springbootexample1.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name, sex, qualification;
	private int age;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisation")
	@JsonIgnore
	private Organisation organisation;

	public Student() {

	}

	public Student(String name, String sex, String qualification, int age, Organisation organisation) {
		super();
		this.name = name;
		this.sex = sex;
		this.qualification = qualification;
		this.age = age;
		this.organisation = organisation;
	}

	
	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
