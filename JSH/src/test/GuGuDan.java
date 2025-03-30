package test;

public class GuGuDan {
	public static void main(String[] args) {
		for(int rom=2; rom < 20; rom++) {
			for(int colum=1; colum < 20; colum++) {
				System.out.printf("%4d", rom * colum);
			}
			System.out.println();
		}
	}

}
