package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor> {

	SessionFactory factory = HiberUtils.getFactory();

	Session session = factory.openSession();

	Transaction tx = session.beginTransaction();
	
	@Override
	public Serializable add(Doctor t) {
		
		Address resiAdd = new Address("C4-1-9, ONGC Complex","Panvel","Navi Mumbai",410221);
		Address cliAdd = new Address("NLH","MIT","Manipal",576104);
		
		t.setClinicAddress(cliAdd);
		t.setResidentialAddress(resiAdd);
		
		Integer key = (Integer)session.save(t);
		tx.commit();
		
		return key;
	}

	@Override
	public Doctor find(Object obj) {
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		return null;
	}

	@Override
	public Doctor update(Doctor obj) {
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		return false;
	}

}
