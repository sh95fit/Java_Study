package JavaStudy01;


public interface Java39_10 extends Java39_8{
	
//	상속 받은 디폴트 메서드 오버라이딩
	@Override
	public default void method2() {
		System.out.println("ChildInter2 - method2()");
	}
	
//	전용 추상 메서드 선언
	public void method3();
}
