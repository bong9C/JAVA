package test;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("동물을 입력하세요.종료하려면 Done 를 입력하세요");
		String animal = sc.next();
		
		if(animal.equals("Done")){
			System.out.println("종료 되었습니다.");
			break;
		
		}who(animal);
		
	}
		sc.close();
}
		
		 static void who(String animal ) {
			String kind = switch(animal) {
			case "고양이","다람쥐","강아지","돌고래" ->"포유류";
			case "타조","참새","부엉이","물총새" ->"조류";
			case "고등어","갈치","날치","참치" -> "어류";
			default->{
			System.out.println("다른 동물을 입력하세요");
			yield "알 수 없음";
			}
			};
			System.out.println(animal+"은(는)"+kind+"입니다.");
			
		}

}



