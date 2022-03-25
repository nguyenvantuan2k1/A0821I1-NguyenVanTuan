package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> product;

    static {

        product = new HashMap<>();
        product.put(1, new Product(1, "iphone 5", "iphone"));
        product.put(2, new Product(2, "iphone 6", "iphone"));
        product.put(3, new Product(3, "iphone 10", "iphone"));
        product.put(4, new Product(4, "iphone 11", "iphone"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product customer) {
        product.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return product.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        product.put(id, customer);

    }

    @Override
    public void remove(int id) {
        product.remove(id);
    }
}
