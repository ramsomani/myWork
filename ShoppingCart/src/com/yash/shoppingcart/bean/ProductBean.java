package com.yash.shoppingcart.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.yash.shoppingcart.domain.Product;
import com.yash.shoppingcart.service.ProductServiceImpl;
import com.yash.shoppingcart.service.ProductServiceIntf;

@ManagedBean
@SessionScoped
public class ProductBean {
	Product product = new Product();
	List list;
	int count;
	
	public int getCount() {
		ProductServiceIntf productServiceIntf=new ProductServiceImpl();
		return productServiceIntf.count(name);
		
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
		HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		String name= ((String)((CustomerBean)session.getAttribute("customerBean")).getCustomer().getUsername());
	public String save() {
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		product.name = req.getParameter("abc");
		product.quantity = Integer.parseInt(req.getParameter("rst"));
		product.price = Integer.parseInt(req.getParameter("xyz"));
		product.total = Integer.parseInt(req.getParameter("pqr"));
		ProductServiceIntf productServiceIntf = new ProductServiceImpl();
		// productServiceIntf.addProduct(product,(((String)session.getAttribute("username"))));
		productServiceIntf.addProduct(product,name);
		return "shopping";
	}

	public String add() {
		//HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		ProductServiceIntf productServiceIntf = new ProductServiceImpl();
		//list = productServiceIntf.getDetails((((String) session.getAttribute("username"))));
		list = productServiceIntf.getDetails(name);
		return "slip";
	}
	
}
