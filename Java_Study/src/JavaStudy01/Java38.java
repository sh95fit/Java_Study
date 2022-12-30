package JavaStudy01;

/*
 다형성
 상속, 인터페이스, 오버라이딩을 통해 구현
 다양한 실행 결과를 얻을 수 있음
 객체를 부품화할 수 있어 유지보수가 용이
 
 매개변수의 다형성
 
 강제 타입 변환(Casting)
 인터페이스 타입으로 자동 타입 변환 후, 구현 클래스 타입으로 전환
 구현 클래스 타입에 선언된 다른 멤버를 사용하기 위해 변환이 이루어짐
 
 객체 타입 확인
 - instanceof 연산자 사용
 */


public class Java38 {

	public static void main(String[] args) {
		Java38_4 myCar = new Java38_4();
		
		myCar.run();
		
		System.out.println("\n");
		
		myCar.frontLeftTire = new Java38_3();
		myCar.frontRightTire = new Java38_3();
		myCar.backLeftTire = new Java38_3();
		myCar.backRightTire = new Java38_3();
		
		myCar.run();
		
		
		Java38_5 myCar2 = new Java38_5();
		myCar2.run();
		
		System.out.println();
		
		myCar2.Java38_1_s[0] = new Java38_3();
		myCar2.Java38_1_s[1] = new Java38_3();
		myCar2.Java38_1_s[2] = new Java38_3();
		myCar2.Java38_1_s[3] = new Java38_3();
		
		myCar2.run();
		
		System.out.println();
		
		
//		인터페이스 타입에 자식 클래스 객체를 저장하여 사용하므로 인터페이스의 멤버만 활용 가능!
		Java38_6 vehicle = new Java38_7();
		vehicle.run();
		
		System.out.println();
		
		Java38_7 bus = new Java38_7();
		bus.run();
		bus.checkFare();
		
		
//		인터페이스 타입 변수에 저장된 자식 클래스 타입 객체를 다시 자식 클래스 타입의 변수에 저장 (강제 타입 변환)
		System.out.println("\n-----강제 타입 변환-----");
		
		Java38_7 bus2 = (Java38_7)vehicle;
		bus2.run();
		bus2.checkFare();
		
		
//		instanceof 연산자 : 지정한 데이터가 지목한 데이터 타입의 변수인지 확인하는 연산자
		System.out.println("\n-----instanceof로 객체 확인-----");
		
		Java38_9 driver = new Java38_9();
		
		Java38_7 bus3 = new Java38_7();
		Java38_8 taxi3 = new Java38_8();
		
		driver.drive(bus3);
		driver.drive(taxi3);
		
	}

}
