package com.training.apps;

//import org.hibernate.*;

import com.training.daos.DoctorDAO;
//import com.training.domains.Address;
import com.training.entity.Doctor;
//import com.training.utils.HiberUtils;

public class FirstApplication {

	public static void main(String[] args) {

//		SessionFactory factory = HiberUtils.getFactory();
//
//		Session session = factory.openSession();
//
//		Transaction tx = session.beginTransaction();
//
//		Doctor doc = new Doctor(104, "Gaurav", 998989988);
//		
//		Address resiAdd = new Address("131, Ram Vihar","Ballupur","Dehradun",248001);
//		Address cliAdd = new Address("1, Dick Road","Dalanwala","Dehradun",248001);
//		
//		doc.setClinicAddress(cliAdd);
//		doc.setResidentialAddress(resiAdd);
		
//		Integer key = (Integer)session.save(doc);
//		
//		System.out.println(key);
//		
//		Doctor doc2 = (Doctor)session.get(Doctor.class, 101);
//		
//		System.out.println(doc2);

//		session.save(doc);
//
//		tx.commit();
//
//		factory.close();
		
		Doctor doc = new Doctor(105, "Dhawal", 999989988);
		DoctorDAO obj = new DoctorDAO();
		Integer pk = (Integer)obj.add(doc);
		System.out.println(pk);

	}

}
