package com.sk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.beans.Student;
import com.sk.hibernate.StudentDao;

@SpringBootApplication(scanBasePackages = { "com" })
public class DemoApplication {

	@Bean
	public StudentDao test() {
		return new StudentDao();
	};

	@Bean
	public Student student() {
		return new Student();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Override
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder
	// builder) {
	// return builder.sources(DemoApplication.class);
	// }

}
