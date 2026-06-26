package com.java.day12;

public class Hollowshpe {

	    public static void main(String[] args) {
	        int size = 5;
	        for (int i = 1; i <= size; i++) {
	            for (int j = 1; j <= size; j++) {
	                // Print stars only on the borders
	                if (i == 1 || i == size || j == 1 || j == size) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}

