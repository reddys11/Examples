package com.vsr.javaHB.pojo;

public class Customer {
	private int Customer_ID;
	private String Customer_Name;
	private String Gender;
	public int getCustomer_ID() {
		return Customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString() {
		return "Customer [Customer_ID=" + Customer_ID + ", Customer_Name=" + Customer_Name + ", Gender=" + Gender + "]";
	}

}
