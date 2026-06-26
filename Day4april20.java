package com.java.oop;
import java.util.Scanner;
public class Day4april20 {

	public static void main(String[] args) {
		Book bk=new Book();
		System.out.println("Enter author,title,edition serially");
		Scanner keyboard=new Scanner(System.in);
		String Author_name =keyboard.nextLine();
		String Title =keyboard.nextLine();
		int setEdition =keyboard.nextInt();
		bk.setAuthor_name(Author_name);
		bk.setEdition(setEdition);
		bk.setTitle(Title);
		if(Author_name.equals(bk.getAuthor_name())) {
			bk.info();
	}

}
}