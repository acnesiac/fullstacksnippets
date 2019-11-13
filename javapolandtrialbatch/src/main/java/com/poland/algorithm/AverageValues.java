package com.poland.algorithm;

import com.poland.domain.Instrument;

public class AverageValues implements StatisticAlgorithm{

	@Override
	public void compute(Instrument item, AlgorithmExecutor ex) {
		 ex.increaseSum(item.getValue());
		 ex.increaseCount();
		 Double  avg = ex.getSum() / ex.getCount();
		 System.out.println(" AVERAGE VALUE:----------------> sum / count :  " + ex.getSum() + "/"+ ex.getCount()  +" = "+ avg );
	}

}
