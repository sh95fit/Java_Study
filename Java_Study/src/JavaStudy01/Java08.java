package JavaStudy01;


//Java 8버전 이후부터 사용하는 시간 관련 클래스
//Java 8 이전에는 Date라는 클래스를 사용했으나 현재는 해당 클래스의 많은 메서드가 사용 중지되어 사용할 수 없음!
import java.time.LocalDateTime;
import java.time.DayOfWeek;

/*
 Switch문
 변수나 연산식의 값에 따라 실행문을 선택할 때 사용
 switch(변수){
 	case 값1:
 		명령식;
 		break;  //break를 해주지 않으면 아래 1번 케이스부터 모두 실행
 	case 값2:
 		명령식;
 		break;
 	case 값3:
 		명령식;
 		break;
 	default :
 		모두 해당하지 않을 시 실행
 		
 
 Switch문은 조건식 부분의 값이 딱 맞게 떨어지는 경우 사용하지만
 else-if문은 조건을 범위로 지정할 수 있다.
 
 즉, Switch-case문은 else-if문으로 100% 대응이 가능하다!
 
 */

public class Java08 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;	//Math.random() : 0.0~0.9까지의 임의의 숫자를 출력하는 함수!, double형으로 출력!
		
		switch(num) {
			case 1 :
				System.out.println("1번");
				break;
			case 2 :
				System.out.println("2번");
				break;
			case 3 :
				System.out.println("3번");
				break;
			case 4 :
				System.out.println("4번");
				break;
			case 5 :
				System.out.println("5번");
				break;
			default :
				System.out.println("6번");
				break;  //생략해도 상관없음
		}
		
//		LocalDateTime date1 = LocalDateTime.now();  //현재시간 불러오기
		LocalDateTime date = LocalDateTime.of(2022,11,22,20,8,0);	//LocalDateTime 클래스로 임의 날짜를 지정해줄 수 있음!
//		System.out.println(date1);
		DayOfWeek weekDay = date.getDayOfWeek();   //한 주의 정보를 숫자로 가지고 있는 클래스
		int day = weekDay.getValue(); //현재 시간을 기준으로 한 주의 무슨 요일인지 숫자로 출력해줌
		// 1 : 월요일, 2 : 화요일 ... 7 : 일요일

		switch(day) {
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;

			default :
				System.out.println("주말(토~일)");
				break;
				
		}		
		
		System.out.println("-------if문으로-------");
		
		if(day==1) {
			System.out.println("월요일");
		}
		else if(day==2) {
			System.out.println("화요일");
		}
		else if(day==3) {
			System.out.println("수요일");
		}
		else if(day==4) {
			System.out.println("목요일");
		}
		else if(day==5) {
			System.out.println("금요일");
		}
		else {
			System.out.println("주말(토~일)");
		}
		
	}

}
