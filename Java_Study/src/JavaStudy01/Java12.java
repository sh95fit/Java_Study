package JavaStudy01;

/*
 데이터 타입 분류
 기본타입 - 참조타입
 - 기본타입 - 정수, 실수, 논리 : 실제 값을 변수 안에 저장
 - 참조타입 - 배열, 열거, 클래스, 인터페이스 : 주소를 통해 객체 참조
 
 * String은 참조타입! 기본타입처럼 사용하지만 참조타입이다
 * 참조타입의 스택영역에는 주소가 담겨 있으며, 주소를 찾아가면 힙 영역에서 값을 확인할 수 있다!
   반면, 기본타입은 스택영역에 바로 값이 저장되어 있다!
   
 메모리 사용 영역
 JVM이 사용하는 메모리 영역
 OS에서 할당 받은 메모리 영역을 3가지 영여긍로 구분!
 메서드 영역, 스택 영역, 힙 영역
 
 메서드 : 소스코드(런타임 등 저장)
 	    JVM이 시작될 때 생성
 	    로딩된 클래스 바이트 코드 내용을 분석 후 저장
 	    모든 스레드가 공유
 스택 : 변수 저장
 	  스레드별로 생성
 	  메서드가 호출할 때 Frame을 스택에 추가(push)
 	  메서드가 종료하면 Frame 제거(pop)	
 		
 힙 : 객체/배열 저장
 	 JVM이 시작할 때 생성
 	 사용되지 않느 ㄴ객체는 Garbage Collector가 자동 제거
 
 참조 변수의 ==(같다) !=(다르다) 연산
 - 기본타입의 경우 ==, != 연산을 통해 값이 같은지 다른지 확인할 수 있다
 - BUT, 참조타입은 값이 같은지 다른지는 확인할 수 없다!
   동일한 객체를 참조하는지 다른 객체를 참조하는지의 판별만 가능하다! (즉, 주소가 같은지 다른지 판단)
 
 null
 변수가 참조하는 객체가 없을 경우 초기값으로 사용 가능
 참조타입의 변수에만 저장 가능
 null로 초기화된 참조 변수는 스택 영역 생성
 빈 문자열과는 다른 의미!
 주소가 없음을 나타냄
 
 NullPointerException
 예외(Exception)
 - 사용자의 잘못된 조작, 잘못된 코딩으로 인해 발생하는 프로그램 오류
   즉 사용자가 관리할 수 있는 오류!
 NullPointerException
 - 참조 변수가 null 값을 가지고 있는 객체의 필드나 메소드를 사용하려고 할 때 발생
   
 String 타입
 문자열 리터럴이 동일하다면 String 객체 공유
 new 연산자를 사용한 String 객체를 생성하게 되면 별도 힘 영역 생성!
 
 
 */

public class Java12 {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		System.out.println("strVar3 : " + strVar3);
		System.out.println("strVar4 : " + strVar4);
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		
	}

}
