package test;

import java.util.Scanner;

public class Ascll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		char c = b.charAt(0);
		System.out.printf("%c",(char)c-32);

		
		sc.close();
		

	}

}
