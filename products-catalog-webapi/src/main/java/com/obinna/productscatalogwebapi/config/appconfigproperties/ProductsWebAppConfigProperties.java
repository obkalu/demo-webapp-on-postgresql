package com.obinna.productscatalogwebapi.config.appconfigproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "productswebapp")
public record ProductsWebAppConfigProperties(
        Integer defaultPageSize
) {
}
