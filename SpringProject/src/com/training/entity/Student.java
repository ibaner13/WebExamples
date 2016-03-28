package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int studId;
	private String studName;
	private String studEmail;
	private String studDept;
	private int acadScores;
	private int acadEvents;
	private int sportsActiv;
	private int culturalActiv;
	private double total;

	public Student() {
		super();
	}

	public Student(int studId, String studName, String studEmail, String studDept, int acadScores, int acadEvents,
			int sportsActiv, int culturalActiv) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.studDept = studDept;
		this.acadScores = acadScores;
		this.acadEvents = acadEvents;
		this.sportsActiv = sportsActiv;
		this.culturalActiv = culturalActiv;
	}

	public Student(double total) {
		super();
		this.total = total;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudDept() {
		return studDept;
	}

	public void setStudDept(String studDept) {
		this.studDept = studDept;
	}

	public int getAcadScores() {
		return acadScores;
	}

	public void setAcadScores(int acadScores) {
		this.acadScores = acadScores;
	}

	public int getAcadEvents() {
		return acadEvents;
	}

	public void setAcadEvents(int acadEvents) {
		this.acadEvents = acadEvents;
	}

	public int getSportsActiv() {
		return sportsActiv;
	}

	public void setSportsActiv(int sportsActiv) {
		this.sportsActiv = sportsActiv;
	}

	public int getCulturalActiv() {
		return culturalActiv;
	}

	public void setCulturalActiv(int culturalActiv) {
		this.culturalActiv = culturalActiv;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studEmail=" + studEmail + ", studDept="
				+ studDept + ", acadScores=" + acadScores + ", acadEvents=" + acadEvents + ", sportsActiv="
				+ sportsActiv + ", culturalActiv=" + culturalActiv + "]";
	}

	public double calculate() {
		total = 0.5 * acadScores + 0.1 * acadEvents + 0.2 * sportsActiv + 0.2 * culturalActiv;
		return total;
	}

}
