package com.day4.java;
import java.util.Scanner;

public class ParameterizedConstructor {

	public static void main(String... args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=input.nextLine();
		System.out.println("Enter your program:");
		String program=input.nextLine();
		Students std=new Students(name,program);
		
		std.printStudentinfo();

	}

}
