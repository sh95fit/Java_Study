package JavaStudy01;

/*
 추상 클래스
 
 추상(abstract)
 실체들 간에 공통되는 특성을 추출한 것

 추상화
 공통적인 요소들만 가져오는 것

 추상 클래스
 실체 클래스들의 공통되는 필드와 메소드를 정의한 클래스 (실체 클래스란? 객체를 만들어 사용할 수 있는 클래스)
 추상 클래스는 실체 클래스의 부모 클래스 역할 (단독 객체가 될 수 없다! 즉 스스로 객체를 만들 수 없다!)
 사용 방법만 제공하는 클래스
 
 추상 클래스의 용도
 - 실체 클래스의 공통된 필드와 메서드의 이름을 통일하기 위해 사용
 - 실체 클래스 작성 시 시간을 절약할 수 있음 (추상 클래스 외 추가적인 필드, 메서드만 정의하면 된다!)
 - 실체 클래스 설계 규격을 정의하고자할 때 사용
 
 추상 클래스 선언
 클래스 선언에 abstract 키워드 사용
 but, new 연산자로 객체를 생성하지 못하고 상속을 통해 자식 클래스만 생성해 사용 가능
 ex>
 public abstract class 클래스 {
 }
 
 추상 메서드와 오버라이딩(재정의)
 추상 클래스는 메서드의 선언부만 존재! (추상 메서드) - 즉, 코드블럭이 없으므로 실행 불가
 실체 클래스에서 메서드 실행 내용을 작성(오버라이딩)
 
 */

public class Java33 {

	public static void main(String[] args) {
//		Java33_1 추상클래스 타입의 변수를 선언한 것이지 객체를 생성한 것이 아니므로 오류가 발생하지 않는다!
		Java33_1 phone;
//		Java33_1 phone = new Java33_1();	// 추상클래스이므로 객체 생성은 되지 않음!
		
//		추상 클래스 Java33_1을 상속 받은 Java33_2 클래스의 객체 생성은 문제 없음
		Java33_2 sp = new Java33_2("홍길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
		System.out.println("-------------------");
		
		Java33_4 cat = new Java33_4();
		Java33_5 dog = new Java33_5();
		
		dog.sound();
		cat.sound();
		System.out.println("-------------------");
		
//		추상 클래스로 객체는 생성 불가! 변수는 생성 가능
		Java33_3 animal = null;
		
		animal = new Java33_5();	// 자동 타입 변환
		animal.sound();
		
		animal = new Java33_4();	// 자동 타입 변환
		animal.sound();
		System.out.println("-------------------");
		
		animalSound(new Java33_5());
		animalSound(new Java33_4());
		animalSound(cat);
		animalSound(dog);
		System.out.println("-------------------");
	}
	
	public static void animalSound(Java33_3 animal) {
		animal.sound();
	}

}
