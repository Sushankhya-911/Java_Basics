package com.java.day12;

public class LSP {
	    public static void main(String[] args) {
	        int height = 6; // Height of the L
	        int width = 5;  // Width of the base of the L

	        for (int i = 1; i <= height; i++) {
	            for (int j = 1; j <= width; j++) {
	                // Condition: Print star if it's the first column OR the last row
	                if (j == 1 || i == height) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // Print two spaces to match the "* " width
	                }
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}

