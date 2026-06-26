package com.java.day12;
import java.util.StringTokenizer;

public class StringAndTokenizer {
	public static void main(String[] args) {
		String str="My, java, pro,gra, mming  ";
		System.out.println("Original string:"+str);
		System.out.println("Trimmed one"+str.trim());
		System.out.println("Length:"+str.length());
		System.out.println("Uppercase:"+str.toUpperCase());
		System.out.println("Lowercase:"+str.toLowerCase());
		System.out.println("Index:"+str.charAt(0));
		System.out.println("Substring:"+str.substring(4,9));
		String [] arr=str.split(" ");
		for(String words:arr) {
			System.out.println(words);
		}
		System.out.println("index of: "+str.indexOf("p"));
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
