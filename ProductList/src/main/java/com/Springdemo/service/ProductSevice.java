package com.Springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springdemo.dao.ProductDAO;
import com.Springdemo.model.Product;

@Service
public class ProductSevice {
	
		@Autowired
		ProductDAO productDAO;
		
	public List<Product> fetchProducts(){
		
		return this.productDAO.getAllProducts();
	}
}
