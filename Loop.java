package com.day8.java;

public class Loop {

	public Loop(int[] arr) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("The largest is "+largest);
	}

}
