package org.ejercicio1.currencyconverterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConverterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConverterServiceApplication.class, args);
    }

}
