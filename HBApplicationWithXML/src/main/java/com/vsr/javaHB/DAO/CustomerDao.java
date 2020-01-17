package com.vsr.javaHB.DAO;

public interface CustomerDao {

	public void saveCustomer(int id, String name,String gender);
	
	public void getCustomer(int id);
	
	public void updateCustomer(int id);
}
