package test;

import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = in.nextInt();
		int answer = 0;
		for (int i = 0; i <= a; i++) {   // i < a 를 사용하면 a는 제외되고 0부터 (a-1)까지 더해짐. a를 포함하려면 i <= a를 사용해야 함.
			answer = i + answer; // 위에는 이렇게 계산 할 거라는 식이고, 답을 추출해내는건 answer 임, 여기에 위에서 계산한 식 대입한다는 거임 ( 계산식 누적 후 최종값 구함)
		}
		
		System.out.println(answer);

	}

}
