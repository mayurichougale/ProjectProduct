package com.Infraterials.Product.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infraterials.Product.Entity.Products;
import com.Infraterials.Product.Repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo product_Repo;
	
	
	public Products product(Products obj ) {
		return product_Repo.save(obj);
	}
	
	
	public Products singleproduct(int id) {
		Optional<Products> abcOptional= product_Repo.findById(id);
		if(abcOptional.isPresent()) {
			return abcOptional.get();
		}else {
			throw new RuntimeException("Product Not Found !!!");
		}
	}
	
	
	
}
