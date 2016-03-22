package com.training.entity;

import java.sql.Timestamp;

import com.training.domains.Address;

public class InPatient extends Patient {
	private int wardNumber;
	private Timestamp dateOfAdmission;
	private Address patAddress;

	public Address getPatAddress() {
		return patAddress;
	}

	public void setPatAddress(Address patAddress) {
		this.patAddress = patAddress;
	}

	public InPatient(int patintId, String patientName, Address patAddress, int wardNumber, Timestamp dateOfAdmission) {
		super(patintId, patientName);
		this.patAddress = patAddress;
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public Timestamp getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(Timestamp dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return 15000;
	}

	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", dateOfAdmission=" + dateOfAdmission + "]";
	}

	public InPatient(int wardNumber, Timestamp dateOfAdmission) {
		super();
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}

}
