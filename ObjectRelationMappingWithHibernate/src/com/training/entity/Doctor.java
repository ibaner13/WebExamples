package com.training.entity;

import java.io.Serializable;
import java.util.Set;

import com.training.domains.Address;

public class Doctor implements Serializable {
	/**
	 * 
	 */

	private int doctorCode;
	private String doctorName;
	private long handPhone;
	private Address residentialAddress;
	private ClinicalAssistant assistant;
	private Set<Patient> patientList;

	public Set<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}

	public ClinicalAssistant getAssistant() {
		return assistant;
	}

	public void setAssistant(ClinicalAssistant assistant) {
		this.assistant = assistant;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	private Address officeAddress;

	public int getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public Doctor() {
		super();
	}

	public Doctor(int doctorCode, String doctorName, long handPhone) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
	}

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", residentialAddress=" + residentialAddress + ", officeAddress=" + officeAddress + "]";
	}

}
