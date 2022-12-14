package JavaStudy01;

public class Java20_2 {
//	정적 멤버
	static String company = "LG"; // 정적 멤버 선언과 동시에 초기화
	static String model = "OLED";
	static String info;	//정적 멤버 선언만 진행 (자동적으로 초기화)
	
// 정적 멤버 초기화 블록
	static {
		info = company + "-" + model;
	}
	
}
