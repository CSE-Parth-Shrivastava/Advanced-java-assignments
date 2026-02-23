package com.Springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Springdemo.model.Product;
import com.Springdemo.service.ProductSevice;

@Controller
public class ProductController {

	@Autowired
	ProductSevice productSevice;
	
	@GetMapping("/products")
	public String getProducts(Model model) {
		List<Product> products=productSevice.fetchProducts();
		
		model.addAttribute("products",products);
		
		return "products";
	}
	
	@GetMapping("/error")
	public String home() {
		return "home";
	}
}
