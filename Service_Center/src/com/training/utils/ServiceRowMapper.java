package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.domains.Customer;
import com.training.domains.Items;
import com.training.domains.Service;

public class ServiceRowMapper implements RowMapper<Service>{

	@Override
	public Service mapRow(ResultSet rs, int rowCount) throws SQLException {
		Customer cust = new Customer();
		cust.setCustomerId(rs.getInt("CustomerId"));
		cust.setCustomerName(rs.getString("CustomerName"));
		Items item = new Items();
		item.setItemId(rs.getInt("ItemId"));
		item.setItemName(rs.getString("ItemName"));
		item.setItemType(rs.getString("ItemType"));
		Service serv = new Service();
		serv.setServiceId(rs.getInt("ServiceId"));
		serv.setCustomer(cust);
		serv.setItems(item);
		serv.setProblemDescription(rs.getString("ProblemDescription"));
		return serv;
	}

}
