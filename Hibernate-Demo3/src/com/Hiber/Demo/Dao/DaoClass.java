package com.Hiber.Demo.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hiber.Demo.Dto.Phone;

public class DaoClass 
{
	public void savePhone(Phone phone)
	{
		Configuration configuration = new Configuration();
		//configuration.addAnnotatedClass(Phone.class);
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(phone);
		transaction.commit();
	}
}
