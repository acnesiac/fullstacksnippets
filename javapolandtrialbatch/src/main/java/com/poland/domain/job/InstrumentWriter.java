/*
 * Copyright 2006-2007 the original author or authors.
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

package com.poland.domain.job;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.poland.domain.Instrument;

/**
 * 
 * @author 
 */
public class InstrumentWriter implements ItemWriter<Instrument> {
	@Override
	public void write(List<? extends Instrument> items) throws Exception {
		items.stream().forEach(System.out::println);
	}
}
