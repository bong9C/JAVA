package test;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요.");
			int n = in.nextInt();
			if(n == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int result = 1;
			for(int i=1;i <= n; i ++) {
				result *= i;
				
			}
			System.out.printf(n+"!의 팩토리얼값은 %d입니다.\n", result);
			
		}
		
			
	}

}
