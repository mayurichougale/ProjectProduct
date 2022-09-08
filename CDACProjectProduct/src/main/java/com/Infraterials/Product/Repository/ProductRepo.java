package com.Infraterials.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Infraterials.Product.Entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {

}
