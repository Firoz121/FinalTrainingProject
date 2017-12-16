package com.versal.tms.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.versal.tms.dao.BaseDAO;
import com.versal.tms.dao.UserDAO;
import com.versal.tms.model.User;




/**
 * this class gives implementation for curd related methods.
 * @author firoz
 *
 */
@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO{

	private static final String String = null;

	public void saveUser(User user) {
	
		String sql="insert into users(name, contact, email, address ,loginname ,password) values(:name, :contact, :email, :address ,:loginname ,:password)";
		
		Map<String,Object> map= new HashMap();
		map.put("name", user.getName());
		map.put("contact", user.getContact());
		map.put("email", user.getEmail());
		map.put("address", user.getAddress());
		map.put("loginname", user.getLoginname());
		map.put("password", user.getPassword());
		KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
		
		Integer userid=kh.getKey().intValue();
		user.setId(userid);
		
		System.out.println("user saved successfully");
		
		
	}
	
	
	
}
