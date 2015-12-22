package com.yash.shoppingcart.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.shoppingcart.dao.CustomerDaoImpl;
import com.yash.shoppingcart.dao.CustomerDaoIntf;
import com.yash.shoppingcart.domain.Product;

public class ProductServiceImpl implements ProductServiceIntf{

	@Override
	public void addProduct(Product product,String username) {
		String query="INSERT INTO PRODUCT VALUES('"+product.getName()+"','"+product.getPrice()+"','"
				+product.getQuantity()+"','"
				+product.getTotal()+"','"
				+username+"')";
		CustomerDaoIntf customerDaoIntf = new CustomerDaoImpl(); 
		customerDaoIntf.update(query);
	}

	@Override
	public List getDetails(String username) {
		 List list=new ArrayList();
		String sql = "Select * from product where username='"+ username +"'";
        CustomerDaoIntf customerDaoIntf = new CustomerDaoImpl();
        ResultSet resultSet = customerDaoIntf.select(sql);
        try{
            while(resultSet.next()){
                Product product =new Product();
                product.setName((resultSet.getString(1)));
                product.setPrice((resultSet.getInt(2)));
                product.setQuantity((resultSet.getInt(3)));
                product.setTotal(resultSet.getInt(4));
                list.add(product);
              }
        }
            catch(Exception e)
            {
            	System.out.println(e);
            }
        
		return list;
	}

	@Override
	public int count(String username) {
		 int i=0;
		String sql="select count(*) from product where username='"+username+"'";
		CustomerDaoIntf customerDaoIntf = new CustomerDaoImpl(); 
		ResultSet resultSet=customerDaoIntf.select(sql);
			try {
				while(resultSet.next())
				{
					i = resultSet.getInt("count(*)");
					System.out.println(i);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return i;
	}

}
