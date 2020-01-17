package com.vsr.javaHB.Main;

import com.vsr.java.HB.Service.Impl.AddcustomerServiceImpl;
import com.vsr.javaHB.Service.AddCustomer;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddCustomer l_objService=new AddcustomerServiceImpl();
    l_objService.addCustomer(1001, "Santhosh", "Male");
	l_objService.fetchCustomer(1001);
	l_objService.updateCustomer(1001);

	}

}
