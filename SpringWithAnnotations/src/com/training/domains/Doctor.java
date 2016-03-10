package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ent")
public class Doctor {

	@Value("Rajesh Khanna")
	private String docName;

	@Value("9886459913")
	private long phoneNumber;

	@Autowired
	@Qualifier("inPat")
	private Patient patient;

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Doctor [Doctor Name: " + docName + ", Phone Number: " + phoneNumber + "]";
	}

	public Doctor() {
		super();
	}

	public Doctor(String docName, long phoneNumber) {
		super();
		this.docName = docName;
		this.phoneNumber = phoneNumber;
	}

	public Patient getPatient() {
		return patient;
	}

	@PostConstruct
	public void init() {
		System.out.println("========== INIT Called ==========");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("========== DESTROY Called ==========");
	}
}
