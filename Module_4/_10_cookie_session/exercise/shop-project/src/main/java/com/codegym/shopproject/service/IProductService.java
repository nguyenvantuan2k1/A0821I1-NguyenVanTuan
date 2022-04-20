package com.codegym.shopproject.service;

import com.codegym.shopproject.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);

    Product getProductById(Long id);
}
