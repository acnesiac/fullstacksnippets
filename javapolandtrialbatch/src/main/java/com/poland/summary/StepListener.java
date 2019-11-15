package com.poland.summary;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepListener implements StepExecutionListener {
    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        int readCount=stepExecution.getReadCount();
        int writeCount=stepExecution.getWriteCount();
        int skipCount=stepExecution.getSkipCount();
        int commitCount=stepExecution.getCommitCount();

        stepExecution.getStartTime();
        stepExecution.getEndTime();
		return null;

    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
		System.out.println("number of items written: " +  stepExecution.getWriteCount());
    }
}