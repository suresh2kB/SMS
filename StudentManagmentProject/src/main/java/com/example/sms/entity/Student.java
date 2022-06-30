package com.example.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// Make this class to an Entity
// Map this entity to a table in database
// Database used for this project is MySQL
// If we will not provide @Table annotation than JPA will not able to
// create a table with This name

@Entity
@Table(name="students")
public class Student {
	
	// Make id as a primary key
	// Make it to auto generated so that we can get unique values
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	//If we will not provide Column name than it will use default 
	// as provided here like : firstname,lastname,email
	
	@Column(nullable=false) 
	public String firstName;
	
	@Column(nullable=false)
	public String lastName;
	
	@Column(name="email")
	public String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
