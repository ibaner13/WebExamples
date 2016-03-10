package com.training.beans;

import java.io.Serializable;
import java.util.logging.*;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Logger log = Logger.getLogger(this.getClass().getName());

	private long customerid;
	private String customername;
	private String email;
	private long handPhone;

	public Customer() {
		super();
	}

	public Customer(Logger log, long customerid, String customername, String email, long handPhone) {
		super();
		this.log = log;
		this.customerid = customerid;
		this.customername = customername;
		this.email = email;
		this.handPhone = handPhone;
	}

	public Logger getLog() {
		return log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		log.info("Set Customer Name Called");
		this.customerid = customerid;
	}

	public String getCustomername() {
		log.info("Get Customer Name Called");
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getInfo() {
		return "Message from Bean";
	}

}
