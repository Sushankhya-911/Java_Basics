 package com.java.day9;

public class BubbleSort {
	static void bubbleString(String[] str) {
		String temp;
		for (int i=0;i<str.length;i++) {
			for (int j=0;j<str.length-i-1;j++) {
				if(str[j+1].compareTo(str[j])<0) {
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
	}

public static void main(String[] args) {
	String[] arr= {"A","C","G","B","M","Z"};
	bubbleString(arr);
	arr[5]="BB";
	for(String s:arr) {
		System.out.print(s+" ");
	}

}
}