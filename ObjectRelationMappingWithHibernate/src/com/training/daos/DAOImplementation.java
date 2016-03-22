
package com.training.daos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;
import com.training.utils.HiberUtils;

public class DAOImplementation implements MyDAO<Doctor> {
	SessionFactory factory = HiberUtils.getFactory();

	Session session = factory.openSession();

	Transaction tx = session.beginTransaction();

	@Override
	public Object add(Doctor t) {
		
        Address residenceAddress = new Address("GT Road","Shastri Nagar","Mumbai",600041);
        Address hospitalAddress = new Address("Sector 22-A","Pocket D","Bangalore",100041);
        t.setOfficeAddress(hospitalAddress);
        t.setResidentialAddress(residenceAddress);
        Integer key = (Integer) session.save(t);
        tx.commit();
		return key;
	}

	@Override
	public Doctor find(Object obj) {
		Doctor doc = null;
		try
		{
		 doc = (Doctor)session.get(Doctor.class, (Integer)obj);
		 
		}catch(HibernateException e){System.out.println("The error is : "+e);}
		return doc;
	}

	@Override
	public List<Doctor> findAll() {
		List<Doctor> list = session.createQuery("from Doctor").list();
		
		return list; 
	}

	@Override
	public Doctor update(Doctor obj) {
		try
		{
			Address residenceAddress = new Address("GT Road","Shastri Nagar","Mumbai",600041);
	        Address hospitalAddress = new Address("Sector 22-A","Pocket D","Bangalore",100041);
			obj.setOfficeAddress(hospitalAddress);
			obj.setResidentialAddress(residenceAddress);

			session.update(obj);
			 tx.commit();
		}catch(HibernateException e){
			System.out.println("Updation Error : "+e);
		}
		
		return obj;
	}

	@Override
	public boolean delete(Object obj) {
		
		try
		{
			session.delete(obj);
			 tx.commit();
		}catch(HibernateException e){
			return false;
		}
		
		return true;
	}

}
