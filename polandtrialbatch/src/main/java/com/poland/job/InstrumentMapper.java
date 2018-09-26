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

package com.poland.job;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import com.poland.domain.Instrument;

public class InstrumentMapper implements FieldSetMapper<Instrument> {

	@Override
	public Instrument mapFieldSet(FieldSet fs) {
		
		if(fs == null){
			return null;
		}
		
		Instrument game = new Instrument();
		game.setINSTRUMENT_NAME(fs.readString("INSTRUMENT_NAME"));
		game.setDate(fs.readString("date"));
		game.setValue(fs.readDouble("value"));
		
		return game;
	}

}
