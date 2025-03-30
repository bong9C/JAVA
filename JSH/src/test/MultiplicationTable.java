package test;

public class MultiplicationTable {

	public static void main(String[] args) {
		int a = 2;
		while(a < 10) {
			int b = 1;
			while(b < 10) {
				System.out.printf("%4d", a * b); //%4d 곱셈 결과를 4자리로 맞춰서 출력 , 2는 앞에 세칸 띄워서 14는 앞에 두칸 띄워서. 
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
