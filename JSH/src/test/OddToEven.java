package test;

import java.util.Scanner;

public class OddToEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		if (num%2==0) {
			System.out.println("짝수입니다.");
		}else
			System.out.println("홀수 입니다.");
		System.out.println("종료되었습니다.");
	}

}
