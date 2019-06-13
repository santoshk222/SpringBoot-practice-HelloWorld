package com.sk.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.beans.Student;
import com.sk.beans.StudentRegistration;

@RestController
@RequestMapping(value = "/class")
public class ClassController {

	@RequestMapping(method = RequestMethod.GET, value = "/getall")
	@ResponseBody
	public List<Student> getAllClass() {
		System.out.println("In getAllStudent");
		return StudentRegistration.getInstance().getStudents();
	}

}
