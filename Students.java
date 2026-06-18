package com.day4.java;

import java.time.LocalDate;

public class Students {
	String name;
	String program;
	LocalDate joined;

	public Students(String name,String program) {
		this.name=name;
		this.program=program;
		this.joined=LocalDate.of(2025, 3,18);
	}
	public void printStudentinfo() {
		System.out.println("==Name==");
		System.out.println(this.program);
		System.out.println("==program==");
		System.out.println(this.name);
		System.out.println("==Joined date==");
		System.out.println(this.joined);
	}
}