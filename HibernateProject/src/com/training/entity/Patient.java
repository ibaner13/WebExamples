package com.training.entity;

public class Patient {

	private int patintId;
	private String patientName;
	private int age;

	public Patient() {
		super();
	}

	public Patient(int patintId, String patientName, int age) {
		super();
		this.patintId = patintId;
		this.patientName = patientName;
		this.age = age;
	}

	public int getPatintId() {
		return patintId;
	}

	public void setPatintId(int patintId) {
		this.patintId = patintId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "patient [patintId=" + patintId + ", patientName=" + patientName + ", age=" + age + "]";
	}

	public double calculate()
	{
		return 150.0;
	}
	
}
