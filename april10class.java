package program;
import java.util.Scanner;

public class april10class {
	
	public static void main(String[] args) {
		day2j d2=new day2j();
		Scanner salad =new Scanner(System.in);
		System.out.println("Write your name");
		d2.name=salad.nextLine();
		System.out.println(d2.introduce());
	}

}


