package com.training.apps;

import com.training.daos.DAOImplementation;
import com.training.entity.Doctor;

public class FirstApplication {

	public static void main(String[] args) {

		/*
		 * SessionFactory factory = HiberUtils.getFactory();
		 * 
		 * Session session = factory.openSession();
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * Doctor doc = new Doctor(104, "Harish", 99898909); Address
		 * residenceAddress = new Address("Gandhi Street","Nehru Nagar"
		 * ,"Chennai",600044); Address hospitalAddress = new Address("Sector 21"
		 * ,"Pocket C","New Delhii",100044);
		 * doc.setOfficeAddress(hospitalAddress);
		 * doc.setResidentialAddress(residenceAddress); //Integer key =
		 * (Integer)session.save(doc); // System.out.println(key);
		 * 
		 * // Doctor doc2 = (Doctor)session.get(Doctor.class, 101); //
		 * System.out.println(doc2); session.save(doc); tx.commit();
		 * 
		 * factory.close();
		 */

		/*
		 * //Add Method Doctor doc = new Doctor(105, "Manish", 99898909);
		 * DAOImplementation obj1 = new DAOImplementation(); Integer pk =
		 * (Integer)obj1.add(doc); System.out.println(pk);
		 */

		// Delete Method
		/*
		 * Doctor doc = new Doctor(105, "Manish", 99898909); DAOImplementation
		 * obj1 = new DAOImplementation(); boolean result = obj1.delete(doc);
		 * System.out.println(result);
		 */

		// Update Method
		/*
		 * Doctor doc = new Doctor(104, "Ravi", 29898909); DAOImplementation
		 * obj1 = new DAOImplementation(); Doctor doctor = obj1.update(doc);
		 * System.out.println("Records Updated as :" + doctor.toString());
		 */

		// Find Method

		/*
		 * DAOImplementation obj1 = new DAOImplementation(); Doctor doc =
		 * obj1.find(new Integer(103)); System.out.println(doc);
		 */

		// FindAll Method
		DAOImplementation obj1 = new DAOImplementation();
		System.out.println(obj1.findAll());

		// All mehods working.
	}

}