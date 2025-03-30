package test;

public class Switch2Demo {
	public static void main(String[] args) {
		color("딸기");
		color("원숭이");
		color("단풍");
		color("니체");
		
	}
	
	static void color(String it) {
		String what = "";
		switch(it) {
		case "딸기":
		case "키위":
			what = "과일";
			break;
			
		case "다람쥐":
		case "원숭이":
			what = "동물";
			break;
			
		case "단풍":
		case "은행":
			what = "나무";
			break;
			
			default:
				System.out.print("누구인가요?");
				what ="철학자";
				
				
		}
		
		System.out.printf("%s는 %s 입니다.\n", it, what);
	}

}
