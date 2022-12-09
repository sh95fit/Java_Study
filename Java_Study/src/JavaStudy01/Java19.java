package JavaStudy01;

/*
- 메서드 오버로딩(Overloading)
 클래스 내에 같은 이름의 메서드를 여러 개 선언하는 것
 하나의 메서드 이름으로 다양한 매개값을 받기 위해 활용
 오버로딩 조건 : 매개변수의 타입, 개수, 순서가 달라야 한다!
 적용 예
 기능은 동일하지만 사용 데이터 타입을 다르게 할 경우 사용
 
- 생성자 오버로딩
 생성자 또한 여러 개 선언 가능!
 * 생성자 : 필드 값을 설정하는 용도로 사용

- 다른 생성자 호출
 this : 객체 자기 자신을 뜻하는 키워드 (객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 사용)
 this() : 다른 생성자를 호출하는 명령어

 
 -> this. 사용 
 내부에서 사용할 때 this.을 붙이면 클래스 내의 필드를 지칭할 수 있음
 ex>
  public class 클래스명 {
  	public 데이터타입 필드1;
  	public 데이터타입 필드2;
  	
  	public 메서드명(매개변수1, 매개변수2) {
  		this.필드1 = 매개변수1;
  		this.필드2 = 매개변수2;
  	}
  	
  	필드와 매개변수 이름이 같아도 구분이 가능함! (즉 인스턴스 필드임을 명확히 하기 위해 사용!)
  	동일하지 않은 경우 this. 생략 가능!

 -> this() 사용
 초기화 내용이 비슷한 중복되는 코드를 간단하게 표현할 때 사용
*/

import java.util.Scanner;

public class Java19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("덧셈할 첫 번째 숫자 입력 >>> ");
		double num1 = sc.nextDouble();
		System.out.println("덧셈할 두 번째 숫자 입력 >>> ");
		double num2 = sc.nextDouble();
		
		Java19_1 cal = new Java19_1();
		
		cal.sum();
		cal.sum(10,20);
		cal.sum(num1,num2);

		System.out.println("덧셈할 첫 번째 숫자 입력 >>> ");
		num1 = sc.nextDouble();
		System.out.println("덧셈할 두 번째 숫자 입력 >>> ");
		num2 = sc.nextDouble();
		
		Java19_2 cal1 = new Java19_2();
		cal1.sub();
		cal1.sub(num1,num2);
		cal1.sub(10,20);
		cal1.sub(1,10.3);
		
		
		Java19_3 cal2 = new Java19_3();
		cal2.ptrCarInfo();
		
		Java19_3 cal3 = new Java19_3("소나타");
		cal3.ptrCarInfo();
		
		Java19_3 cal4 = new Java19_3("그랜저","세단","검정");
		cal4.ptrCarInfo();
		
	}

}