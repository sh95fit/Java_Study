package JavaStudy01;

import java.util.Calendar;

/*
 열거 타입(Enumeration Type)
 
 public enum 열거타입이름 {...}		//파일 이름과 동일한 이름으로 다음과 같이 선언(첫글자 대문자!)
 
 ex1>
 public enum Week {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, ...}	//열거형 상수 이름은 관례적으로 모두 대문자로 작성!
 ex2>
 public enum LoginResult {LOGIN_SUCCESS, LOGIN_FAILED}	// 다른 단어가 결합된 이름인 경우 관례적으로 언더바(_)로 연결
*/


// 열거형은 사용자가 생성하는 데이터 타입이다.
// 정의된 데이터만 사용 가능
// 열거형으로 변수를 생성할 경우 해당 열거형에 지정된 데이터만 저장할 수 있다
// 열거형도 참조 타입으로 null 값을 가질 수 있다!
enum Week {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

public class Java16 {

	public static void main(String[] args) {
		
		System.out.println(Week.MONDAY);
		System.out.println(Week.TUESDAY);
		System.out.println(Week.WEDNESDAY);
		System.out.println(Week.THURSDAY);
		System.out.println(Week.FRIDAY);
		System.out.println(Week.SATURDAY);
		System.out.println(Week.SUNDAY);
		
		Week today = null;
		
		// 자바에서 사용하는 날짜, 시간 관련 클래스 - Calendar
		Calendar cal = Calendar.getInstance();	
		
		// 현재 시간 기준 오늘의 요일을 가져옴 (int 타입으로 반환 1 : SUNDAY ...)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
			case 1 :
				today = Week.SUNDAY;
				break;
			case 2 :
				today = Week.MONDAY;
				break;
			case 3 :
				today = Week.TUESDAY;
				break;
			case 4 :
				today = Week.WEDNESDAY;
				break;
			case 5 :
				today = Week.THURSDAY;
				break;
			case 6 :
				today = Week.FRIDAY;
				break;
			case 7 :
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("\n\n오늘은 "+today+"입니다.");
		
		if(today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("오늘은 휴일입니다.");
		}
		else {
			System.out.println("오늘은 평일입니다.");
		}

	}

}

