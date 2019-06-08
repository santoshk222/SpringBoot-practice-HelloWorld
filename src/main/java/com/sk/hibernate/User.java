package com.sk.hibernate;

public class User {
	String name;
	String address;
	String age;

	public String getName() {
		return name;
	}

	public User(String name, String address, String age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
