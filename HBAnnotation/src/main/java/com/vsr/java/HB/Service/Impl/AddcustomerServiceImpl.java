package com.vsr.java.HB.Service.Impl;

import com.vsr.javaHB.DAO.CustomerDao;
import com.vsr.javaHB.DAO.Impl.CustomerDaoImpl;
import com.vsr.javaHB.Service.AddCustomer;

public class AddcustomerServiceImpl implements AddCustomer{

	public void addCustomer(String name,String Gender) {
		// TODO Auto-generated method stub
		CustomerDao custDao=new CustomerDaoImpl();
		custDao.saveCustomer(name,Gender);
	}

	public void fetchCustomer(int id) {
		// TODO Auto-generated method stub
		CustomerDao custDao=new CustomerDaoImpl();
		custDao.getCustomer(id);
		
	}

	public void updateCustomer(int id) {
		// TODO Auto-generated method stub
		CustomerDao custDao=new CustomerDaoImpl();
		custDao.updateCustomer(id);
		
	}

	
	
}
