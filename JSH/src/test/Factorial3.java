package test;


import java.util.Scanner;

public class Factorial3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =0;
		System.out.println("정수를 입력하세요.");
		n = in.nextInt();
		
		int result = factorial(n);
		System.out.printf("%d의 팩토리얼 값은 %d 입니다.\n", n,result);
	}
	static int factorial(int x) {
		int r=1;
		for(int i=1; i <=x; i++) {
			r*=i;
		}
	return r;
	}
}