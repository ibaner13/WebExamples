package com.training.entity;

import java.io.Serializable;

import com.training.domains.Address;

public class Doctor implements Serializable {

	private int doctorCode;
	private String doctorName;
	private long handPhone;
	private Address residentialAddress;
	private Address clinicAddress;

	public Doctor() {
		super();
	}

	public Doctor(int doctorCode, String doctorName, long handPhone) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
	}

	public Doctor(int doctorCode, String doctorName, long handPhone, Address residentialAddress,
			Address clinicAddress) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.residentialAddress = residentialAddress;
		this.clinicAddress = clinicAddress;
	}

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

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public Address getClinicAddress() {
		return clinicAddress;
	}

	public void setClinicAddress(Address clinicAddress) {
		this.clinicAddress = clinicAddress;
	}

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", residentialAddress=" + residentialAddress + ", clinicAddress=" + clinicAddress + "]";
	}

}
