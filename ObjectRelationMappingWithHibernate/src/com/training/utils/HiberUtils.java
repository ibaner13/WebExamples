package com.training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtils {
	private static SessionFactory factory;

	// use static Factory Singleton pattern

	static {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
	}

	public static SessionFactory getFactory() {
		return factory;
	}

	public static void close() {
		factory.close();

	}
}