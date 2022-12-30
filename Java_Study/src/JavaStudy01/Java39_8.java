package JavaStudy01;

// 부모 메서드
public interface Java39_8 {
	public void method1();
	public default void method2() {
		System.out.println("ParentInter = method2()");
	}
}
