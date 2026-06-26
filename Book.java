package com.java.oop;

public class Book {
	private String Author_name;
	private String Title;
	private int Edition;
public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		this.Author_name = author_name;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public int getEdition() {
		return Edition;
	}
	public void setEdition(int edition) {
		this.Edition = edition;
	}
	public void info() {
		System.out.println("Title:"+Title+"\nAuthor:"+Author_name+"\nedition:"+Edition);
	}
}
