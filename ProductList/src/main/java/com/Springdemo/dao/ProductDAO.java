package com.Springdemo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Springdemo.model.Product;

@Repository
public class ProductDAO {
	public List<Product> getAllProducts(){
		Product pro1=new Product(21, "Krish", 1000.00);
		Product pro2=new Product(28, "Krish", 1000.00);
		Product pro3=new Product(26, "Krish", 1000.00);
		
		return Arrays.asList(pro1,pro2,pro3);
		
	}
	
}
