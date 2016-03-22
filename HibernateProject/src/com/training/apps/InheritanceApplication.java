package com.training.apps;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class InheritanceApplication {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		Patient pat = new Patient(104, "Bellatrix", 51);
//
//		session.save(pat);
//		tx.commit();
//		System.out.println("Normal patient added:  " + pat);

		Timestamp date = new Timestamp(new Date().getTime());
		InPatient patient = new InPatient(108, "Voldemort", 120, 501, date);

		session.save(patient);
		tx.commit();
		System.out.println("One Patient Added:" + patient);
	}

}
