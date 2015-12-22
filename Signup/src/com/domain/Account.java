package com.domain;

public class Account {
	private int accId;
	private int accBalance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accId, int accBalance) {
		super();
		this.accId = accId;
		this.accBalance = accBalance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accBalance=" + accBalance + "]";
	}
	
}
