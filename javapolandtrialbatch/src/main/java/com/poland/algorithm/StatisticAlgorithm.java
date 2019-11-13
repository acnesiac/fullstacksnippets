package com.poland.algorithm;

import com.poland.domain.Instrument;

public interface StatisticAlgorithm {
	public void compute(Instrument item, AlgorithmExecutor ex);
}
