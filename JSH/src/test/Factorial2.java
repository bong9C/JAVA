package test;


import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result=1;
		int n =0;
		while(true) {
			System.out.println("정수를 입력하세요:");
			n = in.nextInt();
			
			if(n==0) {
			break;
		
		}
		int i =n;
		result=1;
		while(i>=1) {
			result *= i;
			i--;
		}
		System.out.printf("%d의 팩토리얼 값은 %d 입니다.\n", n,result);
	}

	}
}