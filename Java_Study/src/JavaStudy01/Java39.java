package JavaStudy01;

/*
 인터페이스 상속
 인터페이스 간 상속 가능!
 하위 인터페이스 구현 클래스는 아래 추상 메서드를 모두 재정의해야 한다!
 - 하위 인터페이스의 추상 메서드
 - 상위 인터페이스들의 추상 메서드
 
 인터페이스 끼리의 상속은 부모 인터페이스의 추상 메서드를 상속 받아 자식 인터페이스의 멤버로 활용!
 
 디폴트 메서드, 인터페이스 확장
 부모 인터페이스의 디폴트 메서드를 자식 인터페이스에서 활용하는 방법
 - 디폴트 메서드를 단순히 상속만 받음
 - 디폴트 메서드를 재정의해서 실행 내용 변경
 - 디폴트 메서드를 추상 메서드로 재선언
 */

public class Java39 {

	public static void main(String[] args) {
		Java39_4 impl = new Java39_4();
		
		impl.methodA();
		impl.methodB();
		impl.methodC();

		System.out.println();
		
		Java39_1 ia = impl;
		ia.methodA();
		System.out.println();
		
		Java39_2 ib = impl;
		ib.methodB();
		System.out.println();
		
		Java39_3 ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
		System.out.println("\n\n");
		Java39_5 m1 = new Java39_6();
		m1.method1();
		m1.method2();
		
		Java39_5 m2 = new Java39_7();
		m2.method1();
		m2.method2();
		
		
		System.out.println("\n\n");

		System.out.println("익명 객체를 사용하여 인터페이스를 1회용 객체로 생성함");
		
		Java39_9 ci1 = new Java39_9() {
			@Override
			public void method1() {
				System.out.println("객체 ci1 - method1()");
			}

			@Override
			public void method3() {
				System.out.println("객체 ci1 - method3()");
			}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		System.out.println("-----------------------");
		
		Java39_10 ci2 = new Java39_10() {

			@Override
			public void method1() {
				System.out.println("객체 ci2 - method1()");
			}

			@Override
			public void method3() {
				System.out.println("객체 ci2 - method3()");
			}
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		System.out.println("-----------------------");
		
		Java39_11 ci3 = new Java39_11() {

			@Override
			public void method1() {
				System.out.println("객체 ci3 - method1()");
			}	
			

			@Override
			public void method2() {
				System.out.println("객체 ci3 - method2()");	
			}

			@Override
			public void method3() {
				System.out.println("객체 ci3 - method3()");	
			}
			
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		
		
	}

}
