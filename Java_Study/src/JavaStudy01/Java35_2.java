package JavaStudy01;

// Java35_1 인터페이스를 구현하기 위한 자식 클래스
// 인터페이스에서 상속 받은 추상메서드 구현 or 클래스에 abstract 키워드 추가
public class Java35_2 implements Java35_1 {
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("TV 볼륨을 " + volume + "로 조절합니다.");
	}
	
	
}
