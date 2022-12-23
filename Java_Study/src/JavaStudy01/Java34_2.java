package JavaStudy01;

// 인터페이스는 스스로 객체를 생성하지 못하므로 반드시 자식 클래스가 상속 받아 기능을 구현하는 형태가 되어야 한다!
// 추상메서드가 인터페이스 상에 존재하는 경우 반드시 상속받은 자식 클래스 내에서 추상 메서드를 구현해야 에러가 발생하지 않는다!
public class Java34_2 implements Java34_1 {
	
	public void ptr() {
		System.out.println(Java34_1.MAX_VOLUME);
		System.out.println(Java34_1.MIN_VOLUME);
		System.out.println(Java34_2.MAX_VOLUME);
		System.out.println(Java34_2.MIN_VOLUME);
	}
	
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨을 "+ volume + "으로 설정합니다.");
	}
	
}
