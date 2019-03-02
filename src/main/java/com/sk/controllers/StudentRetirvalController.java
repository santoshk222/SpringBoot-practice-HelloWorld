package com.sk.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sk.beans.Student;
import com.sk.beans.StudentRegistration;

@Controller
public class StudentRetirvalController {

	@RequestMapping(method = RequestMethod.GET, value = "/allstudent")
	@ResponseBody
	public List<Student> getAllStudent() {
		System.out.println("In getAllStudent");
		return StudentRegistration.getInstance().getStudents();
	}

}
