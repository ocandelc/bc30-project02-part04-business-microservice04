package com.nttdata.bootcamp.bank.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroserviceProductApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceProductApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Product");
    }

}
