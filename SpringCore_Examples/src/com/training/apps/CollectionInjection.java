package com.training.apps;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;
import com.training.domains.Item;

public class CollectionInjection {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Coll_Injection.xml");
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println("Invoice Number: " + inv.getInvoiceNumber());
		System.out.println("Customer: " + inv.getCust());
		System.out.println("Address: " + inv.getCust().getAddr());
		System.out.println("Amount: " +inv.getAmount());
		List<Item> itemList = inv.getItemList();
		for(Item obj: itemList)
		{
			System.out.println(obj);
		}
		double sum = 0;
		HashMap<String,Double> taxes = inv.getTaxes();
		Set<Entry<String, Double>> set = taxes.entrySet();
		Iterator<Entry<String, Double>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String,Double> pair = (Map.Entry<String,Double>)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
			sum = sum + pair.getValue();
		}
	     System.out.println("Sum is: "+sum); 
	}

}
