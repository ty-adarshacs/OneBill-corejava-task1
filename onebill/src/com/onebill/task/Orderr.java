package com.onebill.task;

public class Orderr {
String ordername;
	
	
	double orderamount;
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public double getOrderamount() {
		return orderamount;
	}
	public void setOrderamount(double orderamount) {
		this.orderamount = orderamount;
	}
	
	public void quantity(int n,String name) {
		System.out.println("number of "+name+" is :"+n);
		
	}
	
	
	
	public void totalprice(double price,int n) {
		System.out.println("total price of "+(price*n));
		
	}
	
	

}
