package com.training.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.HibernateSpringExample;
import com.training.entity.Doctor;

public class Application {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		HibernateSpringExample dao = ctx.getBean(HibernateSpringExample.class);
		Doctor doc = new Doctor(101, "Ishika");
		dao.add(doc);

	}

}
