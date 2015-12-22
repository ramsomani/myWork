package com.yash;

public class Order implements Comparable {

	private int orderNumber;
	Order(){}
	Order(int orderNumber)
	{
		this.orderNumber=orderNumber;
	}
	/*@Override
	public int hashCode() {
		return orderNumber;
	}
	@Override
	public boolean equals(Object obj) {
		Order o=(Order) obj;
		return this.orderNumber==o.orderNumber;
	}*/
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + "]";
	}
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Order o1=(Order) arg0;
		
		 if(this.orderNumber==o1.orderNumber)
			 return 0;
		 else if(this.orderNumber>o1.orderNumber)
			 return 1;
		 else return -1;
		
	}
	
	
	
}
