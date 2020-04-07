package com.management.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequest {
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private String role;

}
