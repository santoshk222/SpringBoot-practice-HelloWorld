package com.sk.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sk.beans.Student;

/**
 * 
 * Hibernate utilities.
 * 
 * @author santosh Korade
 *
 */
public class HibernateUtil {
	private static SessionFactory factory;
	private static ServiceRegistry registry;
	static {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		// cfg.addResource("Student.hbm.xml");
		registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		factory = cfg.buildSessionFactory(registry);

	}

	public static SessionFactory getFactory() {
		return factory;
	}

}
