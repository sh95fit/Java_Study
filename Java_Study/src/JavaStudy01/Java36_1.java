package JavaStudy01;

public interface Java36_1 {
	
//	추상 메서드
	void method1();
	void method2();
	
//	신규로 추상 메서드를 추가하게 되면 인터페이스를 상속 받은 자식 클래스가 모두 오류 발생
//	(필수로 추가되어야 할 항목 -> 추상 메서드, 필수가 아닌 경우 -> default 메서드)
//	자식 클래스 마다 해당 추상 메서드를 추가하여 해결하거나 default 메서드를 활용하여 필요한 부분에서만 사용한다
//	이러한 문제를 해결하기 위해 default 메서드 사용
	default void method3() {
		System.out.println("신규 추가 메서드");
	}
	
	public static void method4() {
		System.out.println("정적 메서드");
	}
	
}
