package com.obinna.productscatalogwebapi.repository;

import com.obinna.productscatalogwebapi.model.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface ProductRepository extends ListCrudRepository<Product, Integer>, ListPagingAndSortingRepository<Product, Integer> {
}
