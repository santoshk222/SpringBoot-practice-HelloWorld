package com.sk.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistration {

	private List<Student> studentRecords;
	private static StudentRegistration studentRegId = null;

	public StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}

	public static StudentRegistration getInstance() {
		if (studentRegId == null) {
			studentRegId = new StudentRegistration();
			return studentRegId;
		} else {
			return studentRegId;
		}
	}

	public void add(Student std) {
		studentRecords.add(std);
	}

	public List<Student> getStudents() {
		return studentRecords;
	}

	public String updateStudent(Student modifiedStudent) {
		boolean found = false;
		for (Iterator iterator = studentRecords.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (modifiedStudent.getId() == student.getId()) {
				student.setName(modifiedStudent.getName());
				student.setAddress(modifiedStudent.getAddress());
				found = true;
				break;
			}
		}
		if (found) {
			return "updated";
		} else {
			return "Notfound";
		}
	}

}
