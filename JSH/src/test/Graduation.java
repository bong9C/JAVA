package test;

import java.util.Scanner;

public class Graduation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		System.out.print("전공 이수 학점 : ");
		a = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		b = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		c = in.nextInt();
		if ( a >= 70 && ((b >= 30 && c >= 30)|| (b+c >= 80)) && (a+b+c >= 140) ) {
			System.out.println("고생했다. 졸업 가능! 포기하지 말고, 꿈을 펼치거라");
		} else {
			System.out.println("어이쿠, 포기하지말고 재수강 받거라. 언젠가 도달할 것이다.");
		}
				
		
	}
}


