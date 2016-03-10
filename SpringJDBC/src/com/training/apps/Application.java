package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.InvoiceDAOImpl;
import com.training.entity.Invoice;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		InvoiceDAOImpl obj = ctx.getBean(InvoiceDAOImpl.class);
		Invoice inv = ctx.getBean(Invoice.class);
		inv.setInvoiceNumber(201);
		inv.setCustomerName("Ramesh");
		inv.setAmount(4500.00);
//		boolean result = obj.add(inv);
//		System.out.println("Rows Added = "+ result);
		Invoice inv2 = obj.find(201);
		System.out.println(inv2);
		
	}

}
