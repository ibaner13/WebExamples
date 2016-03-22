package com.training.apps;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.Doctor;
import com.training.entity.*;
import com.training.utils.HiberUtils;

public class One2ManyApplication {
	public static void main(String[] args) {
		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Doctor doc = new Doctor(111, "Mahesh", 87544550062L);
		Address residenceAddress = new Address("Gandhi Street", "Nehru Nagar", "Chennai", 600044);
		Address hospitalAddress = new Address("Sector 21", "Pocket C", "New Delhii", 100044);
		doc.setOfficeAddress(hospitalAddress);
		doc.setResidentialAddress(residenceAddress);
		Timestamp date = new Timestamp(new Date().getTime());
		Address pataddress = new Address("Gandhi Street", "Nehru Nagar", "Chennai", 600044);
		InPatient patient1 = new InPatient(206, "Gaurav", pataddress, 43, date);
		InPatient patient2 = new InPatient(207, "Suresh", pataddress, 55, date);
		InPatient patient3 = new InPatient(307, "Ganesh", pataddress, 55, date);
		InPatient patient4 = new InPatient(407, "Ramesh", pataddress, 55, date);
		Set<Patient> list = new HashSet<Patient>();
		list.add(patient1);
		list.add(patient2);
		list.add(patient3);
		list.add(patient4);
		doc.setPatientList(list);
		session.save(doc);
		tx.commit();
		factory.close();
	}

}
