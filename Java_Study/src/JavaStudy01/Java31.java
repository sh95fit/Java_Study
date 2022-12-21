package JavaStudy01;

/*
 Tip! protected 접근 제한자
	 상속과 관련된 접근 제한자
	 - 같은 패키지 내 : default와 동일
	 - 다른 패키지 : 자식 클래스만 접근 허용 (즉, 상속을 받은 경우에만 접근 가능!)
 
 타입 변환과 다형성 (polymorphism)
 다형성
 - 같은 타입이지만 실행 결과가 다양한 객체 대입(이용) 가능한 성질
 - 부모 타입에는 모든 자식 객체가 대입 가능 (부모 클래스 타입의 객체에 자식 클래스 타입의 객체를 대입)
 - 자식 타입은 부모 타입으로 자동 타입 변환
 - 효과! -> 객체를 부품화 시키는 것이 가능하다!
 
 자동 타입 변환(Promotion)
 - 프로그램 실행 도중에 자동 타입 변환이 일어나는 것
 - 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입할 수 있다!
 - 바로 위 부모가 아니더라도 상속 계층의 상위면 자동 타입 변환(by 삼단논법)
 - 변환 후에는 부모 클래스 멤버만 접근이 가능하다!
  ex> 부모클래스 변수 = 자식클래스 타입; (자식클래스의 타입은 자동으로 부모클래스 타입으로 변환)
  ex> Cat cat = new Cat();
      Animal animal = cat;	== Animal animal = new Cat();도 가능!
      cat == animal
 
 필드의 다형성
 다형성을 구현하는 기술적 방법
 - 부모 타입으로 자동 변환
 - 재정의된 메서드(오버라이딩)
 
 매개변수의 다형성
 - 매개변수가 클래스 타입일 경우
  해당 클래스의 객체 대입이 원칙이나 자식 객체 대입 또한 허용
  - 자동 타입 변환
  - 매개변수의 다형성
 */

public class Java31 {

	public static void main(String[] args) {
		// 패키지 Java31_pack 참고 - 자동 타입 변환
		Java31_2 child = new Java31_2();
		child.method3();
		
		// 다형성 : 부모클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하여, 부모클래스 타입의 객체를 생성한 것처럼 사용
//		부모 클래스 타입의 변수 parent에 자식 클래스의 객체를 대입
//		부모 클래스 타입의 변수에 저장된 내용이 자식 클래스 타입의 객체이므로 실제 데이터는 자식 클래스 타입의 객체인 child! 따라서 child의 멤버가 출력됨
		Java31_1 parent = child;	// 사용목적 : 사용하는 방식을 고정하여 규걱화 가능!
		
		parent.method1();
		parent.method2();	// 오버라이딩된 것이 적용됨!
//		부모 클래스에 존재하는 것과 자식 클래스에서 오버라이딩된 것만 출력이 가능!
//		parent 클래스 타입의 변수이므로!!
//		parent.method3();
		
		
		System.out.println("-------------------------------");
		// Java31_3 ~ Java31_3_3 실행
		Java31_3_3 car = new Java31_3_3();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = new Java31_3_1(car.tires[problemLocation-1].location, 15);
			}
			
//			switch (problemLocation) {
//			case 1 :
//				System.out.println("앞왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new Java31_3_1("앞왼쪽", 15);
//				break;
//			case 2 :
//				System.out.println("앞오른쪽 kumhoTire로 교체");
//				car.frontLeftTire = new Java31_3_2("앞오른쪽", 13);
//				break;
//			case 3 :
//				System.out.println("뒤왼쪽 HankookTire로 교체");
//				car.backLeftTire = new Java31_3_1("뒤왼쪽", 14);
//				break;
//			case 4 :
//				System.out.println("뒤오른쪽 kumhoTire로 교체");
//				car.backRightTire = new Java31_3_2("뒤오른쪽", 13);
//				break;
//			}
			System.out.println("-------------------------------");
		}
		
		System.out.println("-------------------------------");
		
		Java31_4_3 driver = new Java31_4_3();
		
		Java31_4_1 bus = new Java31_4_1();
		Java31_4_2 taxi = new Java31_4_2();
		
//		다형성이 없을 경우 해당 클래스 타입의 객체를 생성 후 객체의 멤버를 호출해야함
//		bus.run();
//		taxi.run();
		
//		Bus, Taxi 클래스의 부모 클래스인 Vehicle 클래스의 객체를 생성
		Java31_4 vehicle = new Java31_4();
		vehicle.run();
		
//		부모클래스의 객체에 자식 클래스의 객체를 대입
//		겉은 부모 클래스의 객체이지만 실제 알맹이는 자식 클래스의 객체이다
		vehicle = bus;
		vehicle.run();	// 사용하는 형태가 균일하지만 결과는 다르게 나옴
		
		vehicle = taxi;
		vehicle.run();	// 사용하는 형태가 균일하지만 결과는 다르게 나옴
		
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(new Java31_4_1());
		driver.drive(new Java31_4_2());
		
		System.out.println("-------------------------------");
		
	}

}
