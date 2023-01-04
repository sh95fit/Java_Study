package JavaStudy01;

/*
 제너릭
 컴파일 단계에서 잘못된 타입이 사용될 수 있는 이슈 제거
 자바5부터 새롭게 추가됨!
 이점
 컴파일 시 강한 타입 체크 가능
 실행 시 타입 에러가 나는 것을 방지
 컴파일 시에 미리 타입을 강하게 체크해서 에러 사전 방지
 타입 변환 제거 가능
 
 제너릭 타입이란?
 타입을 파라미터로 가지는 클래스와 인터페이스
 선언 시 클래스 또는 인터페이스 이름 뒤에 <> 부호를 붙임
 <> 사이에넌 타입 파라미터 위치
 
 제너릭 타입을 사용하지 않는 경우
 Object 타입 사용 -> 빈번한 타입 변환 발생 -> 프로그램 성능 저하
 
 -> 클래스 선언 시 타입 파라미터 지정!
    컴파일 시 타입 파라미터가 구체적인 클래스로 변경된다
 
 */

public class Java43 {

	public static void main(String[] args) {

		Java43_1<String> box1 = new Java43_1<String>();
		box1.set("hello");
		String str = box1.get();
		
		System.out.println(str);
		
		Java43_1<Integer> box2 = new Java43_1<Integer>();
		box2.set(100);
		int ivalue = box2.get();
		
		System.out.println(ivalue);
	}

}
