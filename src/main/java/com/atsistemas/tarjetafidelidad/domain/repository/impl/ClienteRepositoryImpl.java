package com.atsistemas.tarjetafidelidad.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.domain.repository.ClienteRepository;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository{

	@Autowired
	public NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Cliente> getAllUsers() {
		
		String sql="SELECT * FROM CLIENTES";
		Map<String, Object> params = new HashMap<String, Object>();
		List<Cliente> list = jdbcTemplate.query(sql, params, new ClienteMapper());
		
		return list;
	}
	
	
	
	
	private static final class ClienteMapper implements RowMapper<Cliente>{

		@Override
		public Cliente mapRow(ResultSet rs, int rows) throws SQLException {
			Cliente cliente = new Cliente();
			cliente.setClientId(rs.getInt("ID"));
			cliente.setApellidos(rs.getString("APELLIDOS"));
			cliente.setPuntos(rs.getLong("PUNTOS"));
			return cliente;
		}
		
	}




	@Override
	public Cliente getPoints(Cliente cliente) {
		
		String sql = "SELECT * FROM CLIENTES WHERE ID=:clienteId";
		Map<String, Object> params = new HashMap<String, Object>();
		 params.put("clienteId", cliente.getClientId());
		return jdbcTemplate.queryForObject(sql, params, new ClienteMapper());
	}




	@Override
	public Cliente getCliente(int clientId) {
		String sql = "SELECT * FROM CLIENTES WHERE ID=:clienteId";
		Map<String, Object> params = new HashMap<String, Object>();
		 params.put("clienteId", clientId);
		return jdbcTemplate.queryForObject(sql, params, new ClienteMapper());
	}




	@Override
	public void addCliente(Cliente cliente) {
		String sql="INSERT INTO CLIENTES(APELLIDOS,PUNTOS) VALUES(:apellidos,:puntos)";
		Map<String, Object> params =  new HashMap<String, Object>();
		params.put("apellidos", cliente.getApellidos());
		params.put("puntos", cliente.getPuntos());
		jdbcTemplate.update(sql, params);
	}

}
