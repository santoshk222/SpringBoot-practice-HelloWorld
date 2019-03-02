package com.sk.beans;

import java.util.ArrayList;
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

}
