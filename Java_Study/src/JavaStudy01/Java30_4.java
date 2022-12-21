package JavaStudy01;

public class Java30_4 extends Java30_3{
	@Override
	public void speedUp() {
		speed += 10;
//		maxSpeed가 final 필드이므로 수정이 불가능
//		maxSpeed = 300;
	}
	
	
//	부모 클래스인 Java30_3의 멤버 메서드인 stop()가 final 메서드이므로 오버라이딩 불가능
//	@Override
//	public void stop() {
//		
//	}
}
