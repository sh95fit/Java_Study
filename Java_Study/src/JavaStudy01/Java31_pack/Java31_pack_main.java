package JavaStudy01.Java31_pack;

public class Java31_pack_main {

	public static void main(String[] args) {
		Java31_B b = new Java31_B();
		Java31_C c = new Java31_C();
		Java31_D d = new Java31_D();
		Java31_E e = new Java31_E();
		
		
//		부모 클래스(A) 타입의 변수에 B,C,D,E 클래스 타입의 객체를 대입함
		Java31_A a1 = b;
		Java31_A a2 = c;
		Java31_A a3 = d;
		Java31_A a4 = e;
		
		Java31_B b1 = d;
		Java31_C c1 = e;
	}

}
