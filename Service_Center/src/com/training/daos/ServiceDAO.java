package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.domains.Items;
import com.training.domains.Service;
import com.training.ifaces.MyDAO;
import com.training.utils.ServiceRowMapper;

public class ServiceDAO extends JdbcDaoSupport implements MyDAO<Service> {

	@Override
	public boolean add(Service t) {
		boolean result = false;
		String sql = "INSERT INTO SERVICES VALUES(?,?,?,?,?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql,t.getServiceId(),t.getCustomer().getCustomerId(),t.getCustomer().getCustomerName(),t.getItems().getItemId(),t.getItems().getItemName(),t.getItems().getItemType(),t.getProblemDescription());
		if(rowInserted>0)
		{
			result = true;
		}
		return result; 
	}

	@Override
	public Service find(int key) {
		String sql = "Select * from Services where ServiceId=?";
		Service servc = getJdbcTemplate().queryForObject(sql, new ServiceRowMapper(), key);
		return servc;
	}

	@Override
	public List<Service> findAll() {
		String sql = "Select * from Services";
		List<Service> servList = getJdbcTemplate().query(sql,new ServiceRowMapper());
		return servList;
	}

}
