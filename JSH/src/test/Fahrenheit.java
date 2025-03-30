package test;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("화씨 온도를 입력해주세요.");
		double f = scanner.nextDouble();
		double c = (double)5/(double)9*(f - 32);
		System.out.printf("섭씨 온도는 %3.3f 입니다.",c);
		/* 계산법 에시 
		    (f - 32) = 100 - 32 = 68

			5.0 / 9.0 = 0.555...

			0.555... * 68 = 37.777...*/
		scanner.close();
	}

}
