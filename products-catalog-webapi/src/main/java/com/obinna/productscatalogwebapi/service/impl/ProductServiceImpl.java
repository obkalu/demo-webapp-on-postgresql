package com.obinna.productscatalogwebapi.service.impl;

import com.obinna.productscatalogwebapi.model.Product;
import com.obinna.productscatalogwebapi.repository.ProductRepository;
import com.obinna.productscatalogwebapi.service.ProductService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }
}
