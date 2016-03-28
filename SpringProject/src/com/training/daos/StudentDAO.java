package com.training.daos;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Student;
import com.training.ifaces.MyDAO;

public class StudentDAO extends HibernateDaoSupport implements MyDAO<Student> {

	@Override
	public Boolean find(Serializable obj) {
		return null;
	}

	@Override
	public Object add(Student t) {
		Integer stud = null;
		try {
			stud = (Integer) getHibernateTemplate().save(t);
		} catch (HibernateException he) {
			System.out.println("The Insertion Error is : " + he);
		}
		return stud;
	}

	@Override
	public Student findAll() {
		return null;
	}

}
