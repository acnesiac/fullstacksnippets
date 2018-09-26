

package com.poland.summary;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.item.file.FlatFileFooterCallback;

/**
 * Writes summary info in the footer of a file.
 */
public class SummaryInstrumentCallback extends StepExecutionListenerSupport implements FlatFileFooterCallback{

	private StepExecution stepExecution;
	
	@Override
	public void writeFooter(Writer writer) throws IOException {
		System.out.println("number of items written: " +  stepExecution.getWriteCount());
		writer.write("number of items written: " + stepExecution.getWriteCount());
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}

	@AfterStep
	public ExitStatus afterStep(StepExecution stepExecution)
	{
		return null;
	}
}
