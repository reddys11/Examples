package com.vsr.java.HibernateUtil;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBConfigurationUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
 
	public static SessionFactory getSessionFactory() {
		if(!sessionFactory.isClosed()) {
			return sessionFactory;	
		}else {
			return buildSessionFactory();
			
		}
			
	}
/* public Session getSession() {
	 Session ses=null;
	 SessionFactory sesFactory=null;
	 sesFactory=getSessionFactory();
	 if(sesFactory!=null) {
		 ses=sesFactory.openSession();
	 }else {
		 sesFactory=buildSessionFactory();
		 ses=sesFactory.openSession();
	 }
	
	 return ses;
 }*/
	public static void CloseSession() {
		getSessionFactory().close();
	}

}
