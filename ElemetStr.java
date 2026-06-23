package com.day6.java;
import java.util.Scanner;
public class ElemetStr {
	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		int tea=10;int coffee=20;int juice=30;
		System.out.println("Enter  for tea,2 for coffee,3 for juice");
		int choice=keyboard.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your choice is tea,please pay below");
			int payment=keyboard.nextInt();
			System.out.println("Your inserted:"+payment);
			int change=payment-tea;
			System.out.println("Your order is getting ready,please wait few seconds");
			
			System.out.println("...");
			
			System.out.println("...");
			System.out.println("Enjoy your tea");break;
		case 2:
			System.out.println("Your choice is juice,please pay below");
			int payment2=keyboard.nextInt();
			System.out.println("Your inserted:"+payment2);
			int change2=payment2-juice;
			System.out.println("Your order is getting ready,please wait few seconds");
			
			System.out.println("...");
			
			System.out.println("...");
			System.out.println("Enjoy your juice");break;
		case 3:
			System.out.println("Your choice is coffee,please pay below");
			int payment3=keyboard.nextInt();
			System.out.println("Your inserted:"+payment3);
			int change3=payment3-coffee;
			System.out.println("Your order is getting ready,please wait few seconds");
			
			System.out.println("...");
			
			System.out.println("...");
			System.out.println("Enjoy your coffee");break;
		default:System.out.println("Press valid numbers");
		}
		}
}
