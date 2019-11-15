package com.poland.domain.job;


import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.poland.domain.Instrument;

/**
 * Aplies algorithm
 * 
 * @author Adolfo Ruiz Rivas
 */
public class InstrumentProcessor extends JdbcDaoSupport implements ItemProcessor<Instrument, Instrument> {
	public static final BigDecimal FIXED_AMOUNT = new BigDecimal("5");
	
	@Override
	public Instrument process(Instrument item) throws Exception {
		//getJdbcTemplate().queryForInt("SELECT VALUE from INSTRUMENT_PRICE_MODIFIER where ID = ?", item.getId());
		return item.executeAlgorithm(FIXED_AMOUNT);
	}
	
	
}
