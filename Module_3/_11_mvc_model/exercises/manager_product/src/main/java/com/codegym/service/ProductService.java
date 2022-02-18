package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductService {
    static Map<Integer, Product> products= new HashMap<Integer, Product>();
    public ProductService(){
        products.put(1, new Product(1, "product 1", 300000));
        products.put(2, new Product(2, "product 2", 400000));
        products.put(3, new Product(3, "product 3", 500000));
    }

    public ArrayList findAll() {
        return new ArrayList<>(products.values());
    }

    public void save(Product product) {
        products.put(product.getId(), product);
    }

    public Product findById(int id) {
        return products.get(id);
    }

    public void update(int id, Product product) {
        products.put(id, product);
    }

    public void remove(int id) {
        products.remove(id);
    }
}
