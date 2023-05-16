package com.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springmvc.validator.Age;

public class Employee {
	
	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@NotEmpty(message = "required")
	private String name;
	
//	@Size(min = 2)
	@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3 or you inserted special character!!!") 
	private String pass;
	
//	@Min(value=18, message="must be equal or greater than 18")  
//    @Max(value=45, message="must be equal or less than 45")  
	@Age(lower=30,upper = 45)
    private Integer age;  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
