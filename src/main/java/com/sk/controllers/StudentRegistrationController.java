package com.sk.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sk.beans.Student;

@Controller
@RequestMapping("/student")
public class StudentRegistrationController {

	Logger logger = LoggerFactory.getLogger(StudentRegistrationController.class);

	@Autowired(required = true)
	com.sk.hibernate.StudentDao test;

	@Autowired
	Student student;

	final String ADD = "add";
	final String UPDATE = "update";
	final String GET_ALL = "getall";

	/**
	 * Add Student.
	 * 
	 * @param student
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = ADD)
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		logger.debug("add student");
		test.inserStudent(student);
		return student;
	}

	@RequestMapping("/enter")
	@ResponseBody
	public String entersutduent() {
		logger.debug("ener");
		System.out.println("Enter");
		// model.addObject("1", "Santosh");
		// model.setViewName("index");
		return "hello";
	}

	@RequestMapping(method = RequestMethod.PUT, value = UPDATE)
	@ResponseBody
	public void updateStudent(@RequestBody Student student) {
		System.out.println("in update student");
		test.updateStudent(student);
	}

	@RequestMapping(method = RequestMethod.GET, value = GET_ALL)
	@ResponseBody
	public List getAllStudent() {
		System.out.println("in update student");
		return test.getAllStudent();
	}

}
