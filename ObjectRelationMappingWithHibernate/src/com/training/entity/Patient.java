package com.training.entity;

public class Patient {
	private int patId;
	private String patName;

	public Patient() {
		super();
	}

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public Patient(int patId, String patName) {
		super();
		this.patId = patId;
		this.patName = patName;

	}

	public double calculate() {
		return 150.00;
	}
}
