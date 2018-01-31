package com.atsistemas.tarjetafidelidad.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atsistemas.tarjetafidelidad.domain.Item;
import com.atsistemas.tarjetafidelidad.domain.Oferta;
import com.atsistemas.tarjetafidelidad.domain.repository.ItemRepository;

@Repository
public class ItemRepositoryImpl implements ItemRepository{
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Item> getAllItems() {
		
		String sql= "SELECT * FROM ITEMS";
		Map<String, Object> params = new Hashtable<String, Object>();
		
		List<Item> items = jdbcTemplate.query(sql, params, new ItemRowMapper());
		
		return items;
	}
	
	private static final class ItemRowMapper implements RowMapper<Item>{

		@Override
		public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
			Item item = new Item();
			item.setItemId(rs.getString("ID"));
			item.setName(rs.getString("NOMBRE"));
			item.setDescription(rs.getString("DESC"));
			
			return item;
		}
		
	}
	

	@Override
	public Oferta getItem(Item oferta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItem(Item oferta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Item oferta) {
		// TODO Auto-generated method stub
		
	}

}
