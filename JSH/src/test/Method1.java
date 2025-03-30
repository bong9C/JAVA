package test;

public class Method1 {

	public static void main(String[] args) {
			System.out.println("1~10의합 " + sum(1,10));
			System.out.println("1~100의합 " + sum(10,100));
			System.out.println("1~1000의합 " + sum(100,1000));
		
	}
	public static int sum(int i1, int i2) {
		int sum = 0;
		for (int i=i1; i<=i2; i++) 
		sum += i;
		
		return sum;	
		
	}

}
