package JavaStudy01;

public class Java36_4 implements Java36_1 {
	private int k = 3;
	
	@Override
	public void method1() {
		System.out.println("method1()");
		static_method();
	}

	@Override
	public void method2() {
		System.out.println("method2()");	
		static_method();
	}
	
//	default 메서드 : 필요로 하는 자식 클래스에서만 활용
	@Override
	public void method3() {
		System.out.println("Java36_4에서 필요로 하여 추가한 default 메서드");
	}
	
	private void static_method() {
		k--;
		
		if (k < 0) {
			Java36_1.method4();
			k = 3;
		}
	}
	
	
}
