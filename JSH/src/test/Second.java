package test;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int num = in.nextInt();
		int a = num / 3600;
		int b = (num % 3600)/60;
		int c = (num % 3600)%60;
		System.out.printf("%d 시간 %d분 %d초",a,b,c);
		
		in.close();

	}

}
