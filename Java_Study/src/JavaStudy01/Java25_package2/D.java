package JavaStudy01.Java25_package2;

import JavaStudy01.Java25_package1.A;

public class D {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.classC_val_A);
		System.out.println(c.classC_val_B);
		
		A a = new A();
		System.out.println(a.classA_val_A);
		
//		default로 지정되어 있어 다른 패키지에서는 접근할 수 없다!
//		System.out.println(a.classA_val_B);
	}

}
