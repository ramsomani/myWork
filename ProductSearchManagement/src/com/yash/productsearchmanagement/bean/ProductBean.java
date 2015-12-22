package com.yash.productsearchmanagement.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.productsearchmanagement.domain.Product;

@ManagedBean
@RequestScoped
public class ProductBean {
	Product product = new Product();
	List<Product> list = new ArrayList<Product>();
	Set<String> productSet = new HashSet<>();
	Set<String> vendorSet = new HashSet<>();
	Set<String> citySet = new HashSet<>();

	
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public List<Product> getList() {
		return list;
	}


	public void setList(List<Product> list) {
		this.list = list;
	}


	public Set<String> getProductSet() {
		return productSet;
	}


	public void setProductSet(Set<String> productSet) {
		this.productSet = productSet;
	}


	public Set<String> getVendorSet() {
		return vendorSet;
	}


	public void setVendorSet(Set<String> vendorSet) {
		this.vendorSet = vendorSet;
	}


	public Set<String> getCitySet() {
		return citySet;
	}


	public void setCitySet(Set<String> citySet) {
		this.citySet = citySet;
	}


	@PostConstruct
	public void init() {

		list.add(new Product("mobile", "apple", "indore"));
		list.add(new Product("mobile", "samsung", "mumbai"));
		list.add(new Product("mobile", "windows", "indore"));
		list.add(new Product("tv", "lg", "indore"));
		list.add(new Product("tv", "lloyd", "mumbai"));
		list.add(new Product("tv", "samsung", "delhi"));
		list.add(new Product("refrigerator", "lg", "indore"));
		list.add(new Product("refrigerator", "lloyd", "mumbai"));
		list.add(new Product("refrigerator", "samsung", "delhi"));
		for (Product li : list) {
			productSet.add(li.getProduct());
			vendorSet.add(li.getVendor());
			citySet.add(li.getCity());
		}
	}
	
	public void searchProduct()
	{
		
	}

}
