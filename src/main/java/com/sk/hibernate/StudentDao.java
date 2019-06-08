package com.sk.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sk.beans.Student;

/**
 * Student dao class responsible for persisteance of Student.
 * 
 * @author santosh Korade.
 *
 */
public class StudentDao {
	private static SessionFactory factory;
	private static ServiceRegistry registry;

	/**
	 * Constructor for Hibernate.
	 */
	public StudentDao() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		// cfg.addResource("Student.hbm.xml");
		registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		factory = cfg.buildSessionFactory(registry);
	}

	/**
	 * Inserts student into the database
	 * 
	 * @param student
	 * @return
	 */
	public int inserStudent(Student student) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			userId = (Integer) session.save(student);
			tx.commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}

		return 2;
	}

	/**
	 * uppdates the student information.
	 * 
	 * @param student
	 */
	public void updateStudent(Student student) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}
	}
}
