package com.poland.job;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.poland.domain.Instrument;

public class InstrumentRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Instrument customer = new Instrument();
		customer.setINSTRUMENT_NAME(rs.getString("name"));
		customer.setValue(rs.getDouble("multiplier"));
		return customer;
	}

}