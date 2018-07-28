package com.designpattern;

public class LaunchPoint {
	public static void main(String[] args)
	{
		  Student student = new Student("Yagnik","Mer");
		  student.display();
		  
		  Student stud = (Student)student.getClone();
		  stud.display();
	}
}
