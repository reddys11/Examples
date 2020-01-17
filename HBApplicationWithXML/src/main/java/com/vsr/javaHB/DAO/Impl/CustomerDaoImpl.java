package com.vsr.javaHB.DAO.Impl;

import org.hibernate.Session;

import com.vsr.java.HibernateUtil.HBConfigurationUtil;
import com.vsr.javaHB.DAO.CustomerDao;
import com.vsr.javaHB.pojo.Customer;

public class CustomerDaoImpl implements CustomerDao{

	public void saveCustomer(int id, String name,String gender) {
		// TODO Auto-generated method stub
		HBConfigurationUtil HBUtil=new HBConfigurationUtil();
		Session ses=HBUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Customer cust=new Customer();
		cust.setCustomer_ID(id);
		cust.setCustomer_Name(name);
		cust.setGender(gender);
		ses.save(cust);
		ses.getTransaction().commit();
		HBUtil.CloseSession();
	}

	public void getCustomer(int id) {
		// TODO Auto-generated method stub
		HBConfigurationUtil HBUtil1=new HBConfigurationUtil();
		Session ses1=HBUtil1.getSessionFactory().openSession();
		ses1.beginTransaction();
		Customer cust=ses1.get(Customer.class, id);
		System.out.println(cust.getCustomer_ID()+"\n"+cust.getCustomer_Name()+"\n"+cust.getGender());
		ses1.getTransaction().commit();
		HBUtil1.CloseSession();
	}

	public void updateCustomer(int id) {
		// TODO Auto-generated method stub
		HBConfigurationUtil HBUtil1=new HBConfigurationUtil();
		Session ses1=HBUtil1.getSessionFactory().openSession();
		Customer cust1=new Customer();
		cust1=ses1.load(Customer.class, 1001);
		ses1.beginTransaction();
		cust1.setCustomer_Name("Raghav");
		//ses1.saveOrUpdate(arg0, arg1);;
		ses1.getTransaction().commit();
		//cust1=ses1.get(Customer.class, id);
		System.out.println(cust1.getCustomer_ID()+"\n"+cust1.getCustomer_Name()+"\n"+cust1.getGender());
		
		HBUtil1.CloseSession();
	}

}
