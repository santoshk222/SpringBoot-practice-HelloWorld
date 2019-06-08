package com.sk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.beans.Student;
import com.sk.beans.StudentRegistration;

@RestController
public class StudentRegistrationController {

	@Autowired(required = true)
	com.sk.hibernate.StudentDao test;

	@Autowired
	Student student;

	/**
	 * Add Student.
	 * 
	 * @param student
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		System.out.println("in register student");
		StudentRegistration.getInstance().add(student);
		test.inserStudent(student);
		return student;
	}

	@RequestMapping("/enter")
	@ResponseBody
	public String addStudent() {
		return "Hello There";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "student/update")
	@ResponseBody
	public String updateStudent(@RequestBody Student student) {
		System.out.println("in update student");
		return StudentRegistration.getInstance().updateStudent(student);
	}
}
