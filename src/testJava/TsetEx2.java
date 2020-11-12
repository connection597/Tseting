package testJava;

import java.util.Scanner;

public class TsetEx2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		in.close();
		
		System.out.print((A>=90)?"A": (A>=80)?"B":(A>=70)?"c" : (A>=60)?"D" : "F" );
		

	}

}
