/*
 * Copyright 2014 the original author or authors.
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
package com.poland.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.poland.domain.Instrument;
import com.poland.util.Util;

public class InstrumentValidator implements Validator {


	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.isAssignableFrom(Instrument.class);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		Instrument item = null;
		try {
			item = (Instrument) arg0;
		} catch (ClassCastException cce) {
			errors.reject("Incorrect type");
		}
		if(item != null) {
			validateDate(item, errors);
		}
	}
	protected void validateDate(Instrument item, Errors errors) {
		if(Util.isholidayDay(Util.stringToDate(item.getDate()))) {
			System.out.println(" Invalid Date  " );
		}
	}	
}
