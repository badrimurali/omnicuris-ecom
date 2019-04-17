package com.badri.omniecom.omniecom.repository;

import com.badri.omniecom.omniecom.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);

}
