package JavaStudy01;

/*
 정적 메서드
 자바8에서 추가된 인터페이스의 새로운 멤버
 ex> 선언 : [public] static 리턴타입 메서드명(매개변수 ...) {}
 디폴트 메서드처럼 기능 추가 시 사용
 정적 메서드는 객체 생성 없이 사용이 가능
 정적 객체이므로 데이터 공유
 주로 유틸리티 기능을 구현해두고 디폴트 메서드에서 호출하여 주로 사용
 정적 메서드는 상속을 해서 사용하는 것이 아니다!
 호출 시 : 인터페이스.정적메서드 형태
 즉, 자식 클래스에서 오버라이딩이 불가능하다!
 */

public class Java36 {

	public static void main(String[] args) {
		Java36_2 a = new Java36_2();
		
		a.method1();
		a.method2();
		
		Java36_3 b = new Java36_3();
		b.method1();
		b.method2();
		
		Java36_4 c = new Java36_4();
		c.method1();
		c.method2();
		c.method1();
		c.method2();
	}

}
