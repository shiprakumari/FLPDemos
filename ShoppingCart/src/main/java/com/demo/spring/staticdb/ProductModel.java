package com.demo.spring.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.demo.spring.bean.Product;

public class ProductModel {
	
	private List<Product> products;

	public ProductModel() {
		this.products = new ArrayList<Product>();
		this.products.add(new Product("p01", "Product1", "Desert.jpg", 200));
		this.products.add(new Product("p02", "Product2", "Koala.jpg", 210));
		this.products.add(new Product("p03", "Product3", "Lighthouse.jpg", 120));
		this.products.add(new Product("p04","Product4","Chrysanthemum.jpg", 50));
		this.products.add(new Product("p05","Product5","Hydrangeas.jpg", 150));
		this.products.add(new Product("p06","Product6","Jellyfish.jpg", 60));
		this.products.add(new Product("p07","Product7","Penguins.jpg", 250));
		this.products.add(new Product("p08","Product8","Tulips.jpg", 100));
		
	}

	public List<Product> findAll() {
		return this.products;
	}

	public Product find(String id) {
		for (Product product : this.products) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}

}
