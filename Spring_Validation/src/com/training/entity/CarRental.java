package com.training.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class CarRental {

	@NotEmpty(message = "Name Must Be Entered !")
	private String name;

	@Max(9999999999L)
	@Min(1000000000L)
	private long mobileNumber;

	@NotEmpty(message = "Email Must Be Entered !")
	@Email(message = "Email ID Should have @, .com, .in !")
	private String email;

	private String type;

	public CarRental() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarRental [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", type=" + type
				+ "]";
	}

}