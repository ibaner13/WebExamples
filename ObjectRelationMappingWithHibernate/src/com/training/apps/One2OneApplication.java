package com.training.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.ClinicalAssistant;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

public class One2OneApplication {
	public static void main(String[] args) {
		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Doctor doc = new Doctor(110, "Harish", 99898909);
		Address residenceAddress = new Address("Gandhi Street", "Nehru Nagar", "Chennai", 600044);
		Address hospitalAddress = new Address("Sector 21", "Pocket C", "New Delhii", 100044);
		doc.setOfficeAddress(hospitalAddress);
		doc.setResidentialAddress(residenceAddress);

		ClinicalAssistant assistant = new ClinicalAssistant(101, "Mary");
		doc.setAssistant(assistant);
		session.save(doc);
		tx.commit();
		factory.close();
	}
}
