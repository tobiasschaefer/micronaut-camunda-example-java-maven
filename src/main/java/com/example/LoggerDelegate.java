package com.example;

import jakarta.inject.Singleton;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class LoggerDelegate implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(LoggerDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("Hello World: {}", delegateExecution);
    }
}
