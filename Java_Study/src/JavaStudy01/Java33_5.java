package JavaStudy01;

// Dog
//추상 클래스를 상속 받은 자식 클래스는 반드시 추상 클래스를 구현해야 한다
//추상 클래스를 상속 받은 후 추상 메서드를 구현하지 않으면 상속 받은 자식 클래스도 추상 클래스로 사용해야 한다
public class Java33_5 extends Java33_3 {
	
	public Java33_5() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
