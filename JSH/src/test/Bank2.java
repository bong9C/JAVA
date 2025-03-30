package test;

import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("원하시는 업무를 선택하세요.");
		String num = str.next();
		work(num);
		
	}
		private static void work(String num) {
			String x = " ";
			switch(num) {
			case "A":
				x = "입금하기";
				break;
				
			case "B":
				x = "출금하기";
				break;
				
			case "C":
				x = "계좌이체";
				break;
				
				default:
					System.out.println("없는 기능입니다.다시 선택하세요.");
					
				
			}
			System.out.println(x);
			
		}
			
}
