package com.day3.java;
import java.util.Scanner;
public class Day3april15 {
	
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter price: ");
		int price=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter name: ");
		String name=keyboard.nextLine();
		Goods gd=new Goods(name, price);
		
	}

}
