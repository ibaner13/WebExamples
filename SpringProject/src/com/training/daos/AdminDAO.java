package com.training.daos;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Administrator;
import com.training.ifaces.MyDAO;

public class AdminDAO extends HibernateDaoSupport implements MyDAO<Administrator> {

	@Override
	public Object find(Serializable obj) {
		return getHibernateTemplate().get(Administrator.class, obj);
	}

	@Override
	public Object add(Administrator t) {
		return null;
	}

	@Override
	public Administrator findAll() {
		return null;
	}
	
}
