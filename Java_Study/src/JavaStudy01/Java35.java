package JavaStudy01;

/*
 인터페이스
 개발 코드와 객체가 서로 통신하는 접점
 자체적으로 객체 생성이 안 된다! But 변수 생성은 가능
 객체 생성이 안 되므로 반드시 상속을 통해 구현 후 사용 가능
 
 정적 멤버(상수, 정적 메서드)
 추상 메서드
 default 메서드
 
 정적 멤버
 인터페이스에 선언된 필드는 모두 public static final로 지정된다!(디폴트값으로 컴파일 시 자동으로 붙음)
 
 추상 메서드
 public abstract는 생략을 하더라도 컴파일 과정에서 자동적으로 붙게 된다
 상속을 받아 오버라이딩하여 활용 가능
 메서드의 선언부 즉 호출 방법만 기술하고 실제 기능은 기술되어 있지 않음! 
 
 디폴트 메서드
 자바8에서 추가된 인터페이스의 새로운 멤버
 실행 블록을 가지고 있는 메서드!
 default 키워드를 반드시 붙여야 한다!
 기본적으로 public 접근 제한(생략해도 컴파일 과정에서 자동적으로 붙음)
 ex> 선언 : [public] default 리턴타입 메서드명(매개변수 ...) {}
 
 
 */


public class Java35 {

	public static void main(String[] args) {
		Java35_2 tvrc = new Java35_2();
		
		tvrc.turnOn();
		tvrc.setVolume(10);
		tvrc.setMute(true);
		tvrc.setMute(false);
		tvrc.turnOff();

		Java35_3 rrc = new Java35_3();
		
		rrc.turnOn();
		rrc.setVolume(20);
		rrc.setMute(true);
		rrc.setMute(false);
		rrc.turnOff();
	}

}
