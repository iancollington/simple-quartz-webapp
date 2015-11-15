package com.iancollington.blog.simplequartzwebapp;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SimpleJob extends QuartzJobBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleJob.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        while (true) {
            LOGGER.info("Long running job running....");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                LOGGER.error("The thread sleep was interrupted.", e);
            }
        }
    }
}
