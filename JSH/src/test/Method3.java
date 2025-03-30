package test;

public class Method3 {

	public static void main(String[] args) {
		int x =0;
		System.out.println("result() 메서드를 호출하기 전의 x:"+x);
		result(x);
		System.out.println("result() 메서드를 호출한 후의 x:"+x);

	}
	public static void result(int y) {
		System.out.println("result() 메서드를 시작 할 떄의 y:"+ y);
		y++;
		System.out.println("result() 메서드를 끝날 때의 y: "+ y);
	}
}
