package JavaStudy01;

/*
 타입변환과 다형성 (강제 타입 변환(Casting))
 강제 타입 변환
 부모 타입을 자식 타입으로 변환하는 것
 형태
 자식클래스 변수 = (자식클래스) 부모클래스타입; 
 조건
 자식 타입을 부모 타입으로 자동 변환 후, 다시 자식 타입으로 변환할 때 강제 타입 변환 적용
 즉, 변환하고자하는 부모클래스의 자식클래스인 경우만 가능 (객체의 원본이 자식클래스의 객체인 경우만 가능)
 필요한 경우
 자식 타입에 선언된 필드와 메서드를 다시 사용해야할 필요가 있는 경우
 
 객체 타입 확인(instanceof)
 부모 타입이라고 해서 모두 자식 타입으로 강제 타입 변환이 되는 것은 아니다!
 ClassCastException 예외가 발생할 수 있음
 자식 타입인지 우선 확인 후 강제 타입을 실행해야 한다!
 ex> boolean result = 좌항(객체) instanceof 우항(타입)
 ex>
 Parent parent = new Parent();
 Child child = (Child) parent;	//강제 타입 변환을 할 수 없다
 */

public class Java32 {

	public static void main(String[] args) {
		
		Java32_1 parent = new Java32_1();
		
		parent.field1 = "부모클래스의 필드1";
		parent.method1();
		parent.method2();
		
		
		System.out.println("\n");
		
		Java32_2 child = new Java32_2();	// 원본은 자식 클래스여야 한다!
		
		child.field1 = "부모클래스에서 상속받은 field1";
		child.field2 = "자식클래스의 고유 field2";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
//		부모 클래스인 Parent 클래스 타입의 변수 parent에 자식 클래스인 Child의 객체 child를 대입
//		자식 클래스에서 지정했던 값이 출력
//		but, 자식 클래스 내에 있던 필드, 메서드는 활용하지 못하게 된다
		parent = child;
		
		System.out.println(parent.field1);	// 자식 클래스에서 초기화되어있던 값이 출력된다
		parent.field1 = "부모 클래스의 필드 - field1";
		System.out.println(parent.field1);
		parent.method1();
		parent.method2();
		
		
//		강제 타입 변환
//		자식클래스 타입에 부모클래스 객체 대입
//		다시 자식 클래스 내에 있는 필드, 메서드 사용이 가능해진다!
		Java32_2 child2 = (Java32_2) parent;
		child.field1 = "부모클래스에서 상속 받은 필드";
		child.field2 = "자식클래스 고유 필드";
		child.method1();
		child.method2();
		child.method3();

		
//		instanceof 활용
		Java32_3 parentA = new Java32_4();
		new_method1(parentA);
		new_method2(parentA);
		
		Java32_3 parentB = new Java32_3();
//		new_method2(parentB);	//parentB가 자식클래스의 원본이 아닌 부모클래스이므로 강제 타입 변환이 불가능하다!
		new_method1(parentB);
				
	}
	
	public static void new_method1(Java32_3 new_parent) {
		if (new_parent instanceof Java32_4) {
			Java32_4 new_child = (Java32_4) new_parent;
			System.out.println("메소드1 - child로 변환 성공");
		}
		else {
			System.out.println("메소드1 - child로 변환되지 않음");
		}
	}
	
	public static void new_method2(Java32_3 new_parent) {
		Java32_4 new_child = (Java32_4) new_parent;
		System.out.println("메소드2 - child로 변환 성공");
	}

}
