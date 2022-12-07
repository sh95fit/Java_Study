package JavaStudy01;

/*
필드(field)
- 클래스의 멤버변수(=객체의 멤버변수)
- 객체 생성시 자동으로 기본값으로 초기화된다!
- 참조타입(배열, 클래스(String 포함), 인터페이스)은 null로 초기화
- 객체 외부에서 접근 시
  클래스명 변수 = new 클래스명()으로 객체 생성
  -> 변수.필드이름 형태로 사용
- 객체 내부에서는 필드이름으로 바로 접근 가능!

메서드(method)
- 객체의 동작(기능)
- 호출해서 실행할 수 있는 중괄호 블록
- 메서드를 호출하면 중괄호 블록에 있는 모든 코드들이 일괄 실행
- 형태
  리턴타입 메서드 이름 (매개변수,...) {
  	실행할 코드
  }
- 호출 방법
  메서드명(매개변수,...);
- 해당 메서드의 연산 결과를 메소드를 실행한 위치로 되돌려 줌
- 메서드 실행 시 return을 만나면 즉시 메서드 종료

- 메서드의 매개변수
 */

public class Java18 {

	public static void main(String[] args) {
		Java18_1 fiv = new Java18_1();

//		일반적인 변수는 초기화를 하지 않으면 사용할 수 없지만 클래스는 초기화해주지 않아도 자동 초기화되서 사용이 가능하다
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("charField : " + fiv.charField);
		
		System.out.println("booleanField : " + fiv.booleanField);

		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("StringField : " + fiv.stringField);
		
////		기본 정수형
//		byte byteField = 0;
//		short shortField = 0;
//		int intField = 0;
//		long longField = 0L;
//		char charField = 0;
//		
////		기본 논리형
//		boolean booleanField = false;
//		
////		기본 실수형
//		float floatField = 0.0F;
//		double doubleField = 0;
//		
////		참조형
//		int[] arrField = null;
//		String stringField = null;
		
//		Calculator 활용
		System.out.println("-----Java18_1의 메서드 중 Calculator 관련 메서드 사용-----");
		
		Java18_1 calculator = new Java18_1();
		
		calculator.powerOn();
		System.out.println(calculator.plus(5, 3));
		System.out.println(calculator.minus(5, 3));
		System.out.println(calculator.multiple(5, 3));
		System.out.println(calculator.divide(5, 3));
		calculator.powerOff();
		
		Java18_3 cal1 = new Java18_3();
		
		cal1.plus();
		cal1.sub(10, 20);
		
		
		System.out.println("-----메서드의 4가지 형태-----");
		
		Java18_4 cal2 = new Java18_4();
		
		cal2.sum();
		cal2.sub(200, 100);
		System.out.println(cal2.multi());
		System.out.println(cal2.div(300, 100));
		
		
		System.out.println("-----Java18_5의 메서드 중 Calculator 관련 메서드 사용-----");
		
		Java18_5 cal3 = new Java18_5();
		
		cal3.div();
		cal3.sum(20, 30);
		System.out.println(cal3.sub());
		System.out.println(cal3.multi(10, 5));
		
	}

}
