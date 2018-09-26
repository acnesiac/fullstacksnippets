package com.poland.algorithm;

import com.poland.domain.Instrument;
import com.poland.util.Util;

public class AverageFromNov2014 implements StatisticAlgorithm{

	@Override
	public void compute(Instrument item, AlgorithmExecutor ex) {
		if (Util.isLessThanNov2014(item.getDate())){
			ex.increaseSum(item.getValue());
			 ex.increaseCount();
			 Double  avg = ex.getSum() / ex.getCount();
			 //System.out.println(" AVERAGE VALUE(<Nov2014) :-------> sum / count : " + avg );
		}
		 
	}

}

