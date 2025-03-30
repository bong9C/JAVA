package test;

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름은?");
		int a,b;
		a = in.nextInt();
		System.out.print("원기둥의 높이는?");
		b = in.nextInt();
		double c = Math.PI;
		System.out.printf("원기둥의 부피는 %.9f 입니다.",a*b*c);
		
		in.close();
	}

}
