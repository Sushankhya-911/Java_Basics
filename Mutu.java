package com.java.day12;

public class Mutu {
	    public static void main(String[] args) {
	        // Top lobes of the heart
	        for (int i = 1; i < 4; i++) {
	            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
	            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
	            for (int j = 1; j <= 2 * (4 - i); j++) System.out.print(" ");
	            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
	            System.out.println();
	        }
	        // Bottom V-shape of the heart
	        for (int i = 7; i >= 1; i--) {
	            for (int j = 1; j <= 7 - i; j++) System.out.print(" ");
	            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
	            System.out.println();
	        }
	    }
	}
