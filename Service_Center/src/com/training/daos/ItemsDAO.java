package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.domains.Items;
import com.training.ifaces.MyDAO;

public class ItemsDAO extends JdbcDaoSupport implements MyDAO<Items> {

	@Override
	public boolean add(Items t) {
		boolean result = false;
		String sql = "Insert into Items values(?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql, t.getItemId(), t.getItemType(), t.getItemName());
		if (rowInserted > 0)
			result = true;
		return result;
	}

	@Override
	public Items find(int key) {
		String sql = "Select * from Items where itemId=?";
		Items itm = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Items>(Items.class), key);
		return itm;
	}

	@Override
	public List<Items> findAll() {
		String sql = "Select * from Items";
		List<Items> itemList = getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Items>(Items.class));
		return itemList;
	}
	
}
