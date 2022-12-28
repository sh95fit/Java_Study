package JavaStudy01;

/*
 익명 구현 객체
 명시적인 구현 클래스 작성을 생략하고 바로 구현 객체를 얻는 방법
 1회용으로 한 번만 쓸 경우 활용
 이름 없는 구현 클래스 선언과 동시에 객체 생성
 
 활용 형태
 인터페이스 변수 = new 인터페이스() {
 	인터페이스에 선언된 추상 메서드의 실체 메서드 선언
 };
 중괄호 닫고 반드시 세미콜론을 붙여줘야한다!
 인터페이스의 추상 메서드들을 모두 재정의하여야 한다!
 추가적으로 필드와 메서드 선언은 가능하나 익명 객체 안에서만 사용가능하고 외부에서 접근 불가
 인터페이스 변수로 사용이 불가능하다!
 
 다중 인터페이스 구현 클래스
 추상클래스는 단일 상속만 가능하지만 인터페이스는 다중 상속이 가능하다!
 ex> public class 구현클래스명 implements 인터페이스A, 인터페이스B {
 		인터페이스 A에 선언된 추상 메서드의 실체 메서드 선언
 		인터페이스 B에 선언된 추상 메서드의 실체 메서드 선언
 	 }
 
 */


public class Java37 {

	public static void main(String[] args) {
		
//		인터페이스 타입의 변수 선언
		Java37_1 rc = null;
		Java37_2 tv = new Java37_2();
		Java37_3 radio = new Java37_3();
		
		rc = tv;
		rc.turnOn();
		rc.turnOff();
		
		rc = radio;
		rc.turnOn();
		rc.turnOff();
		
		
		// 익명 구현 객체 활용
		// 객체의 이름이 존재하지 않으므로 1회용으로만 사용 가능!
		Java37_1 rc2 = new Java37_1() {

			@Override
			public void turnOn() {
				System.out.println("익명 구현 객체 - 전원 On");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 구현 객체 - 전원 Off");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨을 "+ volume + "로 조절합니다.");
				
			}
			
		};	//세미콜론 필수!
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(10);
		
		System.out.println("\n-------다중 상속-------\n");
		
		Java37_5 stv = new Java37_5();
		stv.turnOn();
		stv.setVolume(5);
		stv.search("https://www.naver.com");
		stv.turnOff();
		
		Java37_1 rc3 = stv;
		Java37_4 search = stv;
		rc3.turnOn();
		rc3.setVolume(5);
		search.search("https://www.daum.net");
		rc3.turnOff();

	}

}
