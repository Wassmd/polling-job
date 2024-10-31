package com.paxier.polling_job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShortLivingProcess implements CommandLineRunner {
    private static final Logger LOGGER =  LoggerFactory.getLogger(ShortLivingProcess.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Running short-living process...");
        Thread.sleep(5000);
        LOGGER.info("Short-living process completed.");
    }
}
