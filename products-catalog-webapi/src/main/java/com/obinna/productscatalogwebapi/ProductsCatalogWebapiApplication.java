package com.obinna.productscatalogwebapi;

import com.obinna.productscatalogwebapi.config.appconfigproperties.ProductsWebAppConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProductsWebAppConfigProperties.class)
public class ProductsCatalogWebapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsCatalogWebapiApplication.class, args);
    }

}
