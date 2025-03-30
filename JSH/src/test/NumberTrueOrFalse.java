package test;

import java.util.Scanner;

public class NumberTrueOrFalse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a % 4 == 0 || a % 5 == 0) {
			if (a % 4 == 0 && a % 5 == 0) {
				System.out.println("true");
				
			}
			
		
		else if (a % 4 == 0 ^ a % 5 == 0) {
			System.out.println("false");
		}
			
		}
		
	}

}
