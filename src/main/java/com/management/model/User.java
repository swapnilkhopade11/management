package com.management.model;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "USER")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; 
	@Basic(optional = false)
	private String firstName;
	@Basic(optional = false)
	private String lastName;
	@Basic(optional = false)
	private String address;
	@Basic(optional = false)
	private Integer age;
	@Basic(optional = false)
	private String role;
}
