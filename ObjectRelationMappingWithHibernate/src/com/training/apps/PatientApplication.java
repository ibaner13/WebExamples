package com.training.apps;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.InPatient;
import com.training.utils.HiberUtils;

public class PatientApplication {
	public static void main(String[] args) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Timestamp date = new Timestamp(new Date().getTime());
		Address pataddress = new Address("Gandhi Street", "Nehru Nagar", "Chennai", 600044);
		InPatient patient = new InPatient(101, "Gaurav", pataddress, 43, date);
		session.save(patient);
		tx.commit();
		factory.close();
		System.out.println(patient);

	}

}
