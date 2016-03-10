package com.training.domains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pat")
public class Patient {

	@Value("Ramesh")
	private String patientName;

	@Value("101")
	private long patientId;

	public Patient() {
		super();
	}

	public Patient(String patientName, long patientId) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "Patient [Patient Name: " + patientName + ", Patient ID: " + patientId + "]";
	}

}
