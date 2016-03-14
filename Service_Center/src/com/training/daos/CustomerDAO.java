package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.domains.Customer;
import com.training.ifaces.MyDAO;

public class CustomerDAO extends JdbcDaoSupport implements MyDAO<Customer> {

	@Override
	public boolean add(Customer t) {
		boolean result = false;
		String sql = "Insert into Customer2016 values(?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql, t.getCustomerId(), t.getCustomerName(), t.getPhoneNumber());
		if (rowInserted > 0)
			result = true;
		return result;
	}

	@Override
	public Customer find(int key) {
		String sql = "Select * from Customer2016 where customerId=?";
		Customer cstmr = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), key);
		return cstmr;
	}

	@Override
	public List<Customer> findAll() {
		String sql = "Select * from Customer2016";
		List<Customer> custList = getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Customer>(Customer.class));
		return custList;
	}

}
