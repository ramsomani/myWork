package com.yash.productsearchmanagement.domain;

public class Product {
	private String product;
	private String vendor;
	private String city;
	
	public Product()
	{	
	}
	
	public Product(String product, String vendor, String city) {
		super();
		this.product = product;
		this.vendor = vendor;
		this.city = city;
	}
	

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
