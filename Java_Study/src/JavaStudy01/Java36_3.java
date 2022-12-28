package JavaStudy01;

public class Java36_3 implements Java36_1 {

	@Override
	public void method1() {
		System.out.println("Java36_3에서 상속 후 구현한 method1()");
	}

	@Override
	public void method2() {
		System.out.println("Java36_3에서 상속 후 구현한 method2()");
	}

//	default 메서드는 불필요한 경우 선언하지 않아도 된다
}
