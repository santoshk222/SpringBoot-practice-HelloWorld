package com.sk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.sk.beans.Address;
import com.sk.beans.Student;
import com.sk.hibernate.StudentDao;

@SpringBootApplication(scanBasePackages = { "com" })
public class DemoApplication extends SpringBootServletInitializer {

	@Bean
	public StudentDao test() {
		return new StudentDao();
	};

	// Student student;

	@Bean
	public Student student() {
		/* student = */
		return new Student(address());
	}

	@Bean
	public Address address() {
		Address address = new Address();
		// student.setAddress(address);
		return address;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

}
