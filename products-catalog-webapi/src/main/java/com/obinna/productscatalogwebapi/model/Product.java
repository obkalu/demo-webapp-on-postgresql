package com.obinna.productscatalogwebapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @NotBlank(message = "Product Name is required")
    private String name;
    private String description;
    @NumberFormat(pattern = "###.##")
    private Double unitPrice;
    private LocalDate dateSupplied;
}
