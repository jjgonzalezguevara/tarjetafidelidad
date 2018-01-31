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

import com.atsistemas.tarjetafidelidad.domain.Usuario;
import com.atsistemas.tarjetafidelidad.domain.repository.UsuarioRepository;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Usuario> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUser(Usuario usuario) {
		String sql = "SELECT * FROM USUARIOS WHERE USR_LOGIN=:usrlogin AND PWD=:usrpwd";
		Map <String, Object> params = new HashMap<String, Object>();
		params.put("usrlogin", usuario.getUserlogin());
		params.put("usrpwd", usuario.getPassword());
		
		Usuario user = jdbcTemplate.queryForObject(sql, params, new UsuarioMapper());
			
		return user;
	}

	@Override
	public void addUser(Usuario usuario) {
		
		String sql="INSERT INTO USUARIOS(NOMBRE,USR_LOGIN,PWD,ROL) VALUES(:nombre,:userlogin,:password,:rol)";
		Map<String, Object> params =  new HashMap<String, Object>();
		params.put("nombre", usuario.getNombre());
		params.put("userlogin", usuario.getUserlogin());
		params.put("password", usuario.getPassword());
		params.put("rol", "ROLE_CLIENT");
		jdbcTemplate.update(sql, params);
	}

	@Override
	public void deleteUser(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario getUserRol(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean usuarioValido(Usuario usuario) {
		
		String sql = "SELECT * FROM USUARIOS WHERE USR_LOGIN=:usrlogin AND PWD=:usrpwd";
		Map <String, Object> params = new HashMap<String, Object>();
		params.put("usrlogin", usuario.getUserlogin());
		params.put("usrpwd", usuario.getPassword());
		
		Usuario user;
		
		try {
			user = jdbcTemplate.queryForObject(sql, params, new UsuarioMapper());
			
		} catch(Exception e) {
			return false;
		}
							
		return true;
	}

	private static final class UsuarioMapper implements RowMapper<Usuario> {

		@Override
		public Usuario mapRow(ResultSet rs, int intRow) throws SQLException {
			Usuario usuario = new Usuario();
			usuario.setUserId(rs.getInt("ID"));
			usuario.setNombre(rs.getString("NOMBRE"));
			usuario.setUserlogin(rs.getString("USR_LOGIN"));
			usuario.setPassword(rs.getString("PWD"));
			usuario.setRol(rs.getString("ROL"));
			return usuario;
		}

	}

}
