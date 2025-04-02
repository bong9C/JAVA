package test;


import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int n = in.nextInt();
		int result=1;
		
		int i =n ;
		while(i>0) {
		result *= i;
		i--;
		
		}
		System.out.printf("%d의 팩토리얼 값은 %d 입니다.", n,result);
	}

}
