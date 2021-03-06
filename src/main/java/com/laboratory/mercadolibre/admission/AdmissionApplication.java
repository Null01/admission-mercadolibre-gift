package com.laboratory.mercadolibre.admission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@ConfigurationPropertiesScan("com.laboratory.mercadolibre.admission.service.properties")
@EnableCaching
public class AdmissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmissionApplication.class, args);
    }

}
