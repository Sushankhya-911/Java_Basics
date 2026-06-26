package com.java.day12;

public class Xshape {
	    public static void main(String[] args) {
	        int size = 8;
	        for (int i = 1; i <= size; i++) {
	            for (int j = 1; j <= size; j++) {
	                // i == j is the main diagonal, i + j == size + 1 is the opposite diagonal
	                if (i == j || i + j == size + 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}