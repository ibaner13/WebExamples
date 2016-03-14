package com.training.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.CustomerDAO;
import com.training.daos.ItemsDAO;
import com.training.daos.ServiceDAO;
import com.training.domains.Customer;
import com.training.domains.Items;
import com.training.domains.Service;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		CustomerDAO obj = ctx.getBean(CustomerDAO.class);
		Customer cstmr = ctx.getBean(Customer.class);
		cstmr.setCustomerId(101);
		cstmr.setCustomerName("Dhawal");
		cstmr.setPhoneNumber(9886459913L);
//		boolean result = obj.add(cstmr);
//		System.out.println("Rows Added = "+ result);
		Customer cust2 = obj.find(102);
		System.out.println(cust2 + "\n");
		List<Customer> cust3 = obj.findAll();
		for(Customer objCust: cust3)
			System.out.println(objCust);
		
		ItemsDAO objItm = ctx.getBean(ItemsDAO.class);
		Items itms = ctx.getBean(Items.class);
		itms.setItemId(1001);
		itms.setItemType("Laptop");
		itms.setItemName("Dell");
//		boolean result2 = objItm.add(itms);
//		System.out.println("Rows Added = "+ result2);
		Items itm2 = objItm.find(1002);
		System.out.println("\n" + itm2 + "\n");
		List<Items> itm3 = objItm.findAll();
		for(Items objItem: itm3)
			System.out.println(objItem);
		
		ServiceDAO objSer = ctx.getBean(ServiceDAO.class);
		Service serv = ctx.getBean(Service.class);
		serv.setServiceId(1102);
		serv.setCustomer(cstmr);
		serv.setItems(itms);
		serv.setProblemDescription("Screen Not Working");
//		boolean result3 = objSer.add(serv);
//		System.out.println("Rows Added = "+ result3);
		Service serv2 = objSer.find(1102);
		System.out.println("\n" + serv2 + "\n");
		List<Service> serv3 = objSer.findAll();
		for(Service objServ: serv3)
			System.out.println(objServ);
	}

}
