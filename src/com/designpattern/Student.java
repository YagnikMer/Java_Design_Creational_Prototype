package com.designpattern;

public class Student implements PrototypeEx {

	private String name;
	private String surName;

	public Student(String name, String surName) {
		this.name = name;
		this.surName = surName;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Surname : " + surName);
	}

	@Override
	public PrototypeEx getClone() {
		return new Student(name, surName);
	}
}