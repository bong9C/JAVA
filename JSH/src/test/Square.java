package test;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = in.nextInt();
		System.out.printf("%d 의 제곱은 " + a*2,a);
		
		in.close();
	}

}
