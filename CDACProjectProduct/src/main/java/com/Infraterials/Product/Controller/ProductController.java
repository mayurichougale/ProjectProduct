package com.Infraterials.Product.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Infraterials.Product.Entity.Products;
import com.Infraterials.Product.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
    private	ProductService objProductService;
	
	@PostMapping("/add")
	public String addproduct(@RequestBody Products objProducts) {
		objProductService.product(objProducts);
		return "Product added successfully";
	}
	
	@GetMapping("/{id}")
	
	public Products showProducts(@PathVariable Integer id) {
		return objProductService.singleproduct(id);
	}
	
	
	
	
	
	
}
