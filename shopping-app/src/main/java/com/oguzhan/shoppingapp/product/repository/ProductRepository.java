package com.oguzhan.shoppingapp.product.repository;

import com.oguzhan.shoppingapp.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
