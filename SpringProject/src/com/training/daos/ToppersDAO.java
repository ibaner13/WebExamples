package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Student;
import com.training.ifaces.MyDAO;

public class ToppersDAO extends HibernateDaoSupport implements MyDAO<Student>{

	@Override
	public Boolean find(Serializable obj) {
		return null;
	}

	@Override
	public Object add(Student t) {
		return null;
	}

	@Override
	public Student findAll() {
		return null;
	}
	
	public List<Student> getStudents(Serializable t) {
		String hql="FROM Student S WHERE S.studDept='"+t+"' ORDER BY S.total DESC";
		Query query = getSession().createQuery(hql);
		query.setMaxResults(3);
		
		List<Student> results = (List<Student>)query.list();
		return results;
	}
}
