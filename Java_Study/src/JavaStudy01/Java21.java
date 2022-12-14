package JavaStudy01;

/*
 싱글톤(Singleton)		// 디자인 패턴 중 하나
 하나의 애플리케이션 내에서 단 하나만 생성되는 객체
 */

public class Java21 {

	public static void main(String[] args) {

//		생성자를 사용할 수 없어 new 키워드로 객체를 생성할 수 없음
//		Java21_1 obj1 = new Java21_1();
//		Java21_1 obj2 = new Java21_1();
		
		Java21_1 obj1 = Java21_1.getInstance();
		Java21_1 obj2 = Java21_1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("두 객체가 같음");
		}
		else {
			System.out.println("두 객체가 다름");
		}
		
	}

}
