package com.sk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sk.beans.Student;
import com.sk.beans.StudentRegistration;
import com.sk.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController {

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	@ResponseBody
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("in register student");
		StudentRegistrationReply reply = new StudentRegistrationReply();
		reply.setId(student.getId());
		reply.setName(student.getName());
		// reply.setRegId(student.getId());
		reply.setRegStatus("Success");
		StudentRegistration.getInstance().add(student);
		return reply;
	}
}
