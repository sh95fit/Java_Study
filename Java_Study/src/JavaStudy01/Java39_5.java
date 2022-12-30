package JavaStudy01;

public interface Java39_5 {
	public void method1();
	
//	기능 추가 - 디폴트 메서드
	public default void method2() {
		System.out.println("MyInter - method2() 실행");
	}
}
