package com.careydevelopment.braintreedemo.config;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.braintreegateway.BraintreeGateway;
import com.careydevelopment.braintreedemo.util.BraintreeGatewayFactory;

@Configuration
@ComponentScan("com.braintreegateway")
public class BraintreeConfig {
    
    private static String CONFIG_FILENAME = "config.properties";

    @Bean
    public BraintreeGateway getBraintreeGateway() {
        File configFile = new File(CONFIG_FILENAME);
        BraintreeGateway gateway = null;
        
        try {
            if(configFile.exists() && !configFile.isDirectory()) {
                gateway = BraintreeGatewayFactory.fromConfigFile(configFile);
            } else {
                gateway = BraintreeGatewayFactory.fromConfigMapping(System.getenv());
            }            
        } catch (NullPointerException e) {
            System.err.println("Could not load Braintree configuration from config file or system environment.");
            System.exit(1);
        }
        
        return gateway;
    }
}
