package test;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		double score = scanner.nextDouble();
		if(score >= 90) {
			System.out.println("등급 : A ");
		} else if(score >= 80) {
			System.out.println("등급 : B ");
		} else if(score >= 70) {
			System.out.println("등급 : C ");
		} else 
			System.out.println("이하 등급은 다시 공부하세요. 재시험은 일주일 뒤 입니다.");
		
	}

}
