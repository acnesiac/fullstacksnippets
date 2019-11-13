package com.poland.algorithm;

import com.poland.domain.Instrument;

public class AlgorithmExecutor {
	Double sum = new Double(0);
	int count;
	
	public void execute(StatisticAlgorithm alg,Instrument item){
		alg.compute(item, this);
	}

	public void increaseSum(Double value) {
		sum += value;
	}
	public void increaseCount() {
		count ++;
	}

	public Double getSum() {
		return sum;
	}
	
	public int getCount() {
		return count;
	}

}
