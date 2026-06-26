package com.java.day12;

public class Pyramid {
		public static void main(String[] args) {
			int rows = 5;

			for (int i = 1; i <= rows; i++) {
				// Print leading spaces
				for (int j = rows - i; j >= 1; j--) {
					System.out.print(" ");
				}
				// Print stars
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

