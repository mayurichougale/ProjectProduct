package com.Infraterials.Product.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {

	
@Id
@Column(name = "product_id")
@GeneratedValue(strategy =GenerationType.IDENTITY)
 private Integer product_id;
@Column(name = "product_name",nullable = false)
 private String product_name;
@Column(name = "description",nullable = false)
 private String description;
@Column(name = "price",nullable = false)
 private double price;
@Column(name = "category",nullable = false)
 private String category;
@Column(name = "sub_category",nullable = false)
 private String sub_category;
@Column(name = "img",nullable = true)
 private byte[] img;
 
 
public Products(String product_name, Integer product_id, String description, double price, String category,
		String sub_category, byte[] img) {
	super();
	this.product_name = product_name;
	this.product_id = product_id;
	this.description = description;
	this.price = price;
	this.category = category;
	this.sub_category = sub_category;
	this.img = img;
}


public Products() {
	super();
}


public String getProduct_name() {
	return product_name;
}


public void setProduct_name(String product_name) {
	this.product_name = product_name;
}


public long getProduct_id() {
	return product_id;
}


public void setProduct_id(Integer product_id) {
	this.product_id = product_id;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


public String getSub_category() {
	return sub_category;
}


public void setSub_category(String sub_category) {
	this.sub_category = sub_category;
}


public byte[] getImg() {
	return img;
}


public void setImg(byte[] img) {
	this.img = img;
}
 
 
 
 
	
	
	
	
	
}
