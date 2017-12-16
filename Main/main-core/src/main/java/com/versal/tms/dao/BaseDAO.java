package com.versal.tms.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 * This class give us support for database relation operation.it gives us datasource for jdbcTemplet operation.
 * @author firoz
 *
 */
public class BaseDAO  extends NamedParameterJdbcDaoSupport {
	
	@Autowired
	public void setDatsource2(DataSource ds){
		
		super.setDataSource(ds);
	}

}
