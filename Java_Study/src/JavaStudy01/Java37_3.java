package JavaStudy01;

public class Java37_3 implements Java37_1{
	@Override
	public void turnOn() {
		System.out.println("전원 On");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 Off");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨을 "+ volume + "로 조절합니다.");
	}
}
