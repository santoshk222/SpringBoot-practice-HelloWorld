package com.sk.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sk.beans.Student;

/**
 * Student dao class responsible for persisteance of Student.
 * 
 * @author santosh Korade.
 *
 */
public class StudentDao {
	private static SessionFactory factory = HibernateUtil.getFactory();

	/**
	 * Constructor for Hibernate.
	 */
	public StudentDao() {
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
			session.update(student);
			tx.commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}
	}

	/**
	 * Fetch all student.
	 * 
	 * @return list
	 */
	public List getAllStudent() {
		Session session = factory.openSession();
		Transaction tx = null;
		List list = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("From Student");
			list = query.list();
			tx.commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}
		return list;
	}
}
