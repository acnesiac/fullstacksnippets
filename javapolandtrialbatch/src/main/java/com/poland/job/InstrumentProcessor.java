package com.poland.job;
/*
 * Copyright 2006-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.Validator;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.poland.algorithm.AlgorithmExecutor;
import com.poland.algorithm.AverageFromNov2014;
import com.poland.algorithm.AverageValues;
import com.poland.domain.Instrument;
import com.poland.util.Util;

/**
 * Aplies algorithm
 * 
 * @author Adolfo Ruiz Rivas
 */
public class InstrumentProcessor extends JdbcDaoSupport implements ItemProcessor, InitializingBean {

	private Validator<? super Instrument> validator;
	private AlgorithmExecutor algorithmExecutor;
	
	public InstrumentProcessor(Validator<? super Instrument> validator){
		this.validator = validator;
	}
	
//	@Override
//	public Instrument process(Instrument item) throws Exception {
//		//getJdbcTemplate().queryForInt("SELECT VALUE from INSTRUMENT_PRICE_MODIFIER where ID = ?", item.getId());
//		//return item.executeAlgorithm(FIXED_AMOUNT);
//		try {
//			validator.validate(item);
//			System.out.println("Valiadting : " + item);
//		}
//		catch (ValidationException e) {
//				return null; // filter the item
//		}
//		incrementIndex();
//		return item;
//	}

	
		public AlgorithmExecutor getAlgorithmExecutor() {
			return algorithmExecutor;
		}
	
		public void setAlgorithmExecutor(AlgorithmExecutor algorithmExecutor) {
			this.algorithmExecutor = algorithmExecutor;
		}

	//	 private void meanAllValues(Instrument item) {
//		 sum += item.getValue();
//		 count++;
//		 System.out.println(" count     -----------------" + count);
//		 System.out.println(" sum       -----------------" + sum );
//		 Double  avg = sum / count;
//		 System.out.println(" average   ----------------- sum / count : " + avg );
//    }
//	 
//	 private void meanAllValuesFromNov2014(Instrument item) {
//		 String date = item.getDate();
//		 
//		 sum += item.getValue();
//		 count++;
//		 System.out.println(" count     -----------------" + count);
//		 System.out.println(" sum       -----------------" + sum );
//		 Double  avg = sum / count;
//		 System.out.println(" average   ----------------- sum / count : " + avg );
//    }
//	 
	@Override
	public Object process(Object item) throws Exception {
		Instrument item2 = (Instrument)item;
		if(Util.isholidayDay(Util.stringToDate(item2.getDate()))) {
			System.out.println(" Non Bussines Date  " );
			return null;
		}else{
			Double queryForLong =findByCustomerId(item2.getINSTRUMENT_NAME());
			item2.setValue(item2.getValue() * queryForLong);
			algorithmExecutor.execute(new AverageValues(), item2);
			algorithmExecutor.execute(new AverageFromNov2014(), item2);
		}
		return item;
	}
	
	@SuppressWarnings("unchecked")
	public Double findByCustomerId(String name){
		Double multiplier = 1D;
		String sql = "SELECT name, multiplier from INSTRUMENT_PRICE_MODIFIER where name = ?";
		Instrument inst = null;
		try {
			 inst = (Instrument)getJdbcTemplate().queryForObject(
					sql, new Object[] { name }, new InstrumentRowMapper());		
			 if (inst!=null){
				 System.out.println("Instrument from DB found! =) "  + inst );
				 multiplier= inst.getValue();
			 }
		} catch (Exception e) {
			 System.out.println("Instrument from DB NOT found =( "  + name );

			multiplier = 1D;
		}
		return multiplier;
	}
	
}
