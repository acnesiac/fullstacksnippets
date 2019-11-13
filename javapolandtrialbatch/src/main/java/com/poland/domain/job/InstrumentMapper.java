

package com.poland.domain.job;

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
