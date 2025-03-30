package test;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		
		while(true) {
		System.out.println("원하시는 업무를 선택하세요.");
		String abc = str.next();
		
		if(abc.equals("Q")){
			System.out.println("은행 없무를 종료 합니다.");
			break;
			
		}work(abc); // 사용자가 "Q"를 입력하지 않았다면 다시 while 문으로 돌아감
	}
		
}
		private static void work(String abc) {
			String x = " ";
			switch(abc) {
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
