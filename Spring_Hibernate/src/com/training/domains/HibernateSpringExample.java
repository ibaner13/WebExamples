package com.training.domains;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;

public class HibernateSpringExample extends HibernateDaoSupport implements MyDAO<Doctor>{

	@Override
	public Object add(Doctor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor find(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor update(Doctor obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
