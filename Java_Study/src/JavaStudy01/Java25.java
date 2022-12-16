package JavaStudy01;

/*
 캡슐화
 
 * 접근 제한자
 public(제한 없음) > protected(상속된 자식 클래스만 접근 가능) > default(같은 패키지 내에서만 접근 가능) > private(전체 접근 제한)
 
 * Getter와 Setter
 클래스 선언할 때 필드는 일반적으로 private 접근 제한
 읽기 전용 필드가 있을 수 있음 -> Getter의 필요성
 외부에서 엉뚱한 값으로 변경할 수 없도록 함 -> Setter의 필요성
 
 Getter : private 필듸의 값을 리턴하는 역할(필요시 필드 값 가공)
 Setter : 외부에서 주어진 값을 필드 값으로 수정
 */

public class Java25 {

	public static void main(String[] args) {
		Java25_3 acc1 = new Java25_3();
		acc1.ptrMember();
		
//		str1은 public으로 접근 제한이 없음
		System.out.println("str1 : " + acc1.str1);
//		str2는 defalut로 같은 패키지 내에서 접근 가능
		System.out.println("str2 : " + acc1.str2);
//		str3은 접근제한자가 private으로 설정되어 있어 해당 객체 외부에서 직접 호출할 수 없음
//		System.out.println("str3 : " + acc1.str3);

		
		Java25_4 myCar = new Java25_4();
//		speed는 private로 외부에서 직접 접근이 불가능 하다!
//		myCar.speed = 50;

		myCar.setSpeed(-50);	// Setter : 우회에서 접근하는 방법 제공!
		System.out.println("내 차의 현재 속도 : " + myCar.getSpeed());	// Getter
		
		myCar.setSpeed(60);
		System.out.println("내 차의 현재 속도 : " + myCar.getSpeed());	
		
		if(myCar.isStop() == false) {
			myCar.setStop(true);			
		}
		
		System.out.println("내 차의 현재 속도 : " + myCar.getSpeed());
		
	}

}
