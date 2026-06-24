package com.java.day9;


public class BubbleSortInt{
	static void bubbleInt(int[] str) {
		int temp;
		for (int i=0;i<str.length;i++) {
			for (int j=0;j<str.length-i-1;j++) {
				if(str[j+1]<str[j]) {
					temp=str[j+1];
					str[j+1]=str[j];
					str[j]=temp;
				}
			}
		}
	}

public static void main(String[] args) {
	int[] arr= {1,5,8,2,10};
	bubbleInt(arr);
	
	for(int s:arr) {
		System.out.print(s+" ");
	}

}
}