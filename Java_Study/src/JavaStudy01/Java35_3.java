package JavaStudy01;

public class Java35_3 implements Java35_1 {

	@Override
	public void turnOn() {
		System.out.println("Radio 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Radio 볼륨을 " + volume + "로 조절합니다.");
	}
	
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("Radio 볼륨을 음소거 처리합니다.");
			setVolume(0);
		}
		else {
			System.out.println("Radio 볼륨 음소거를 해제합니다.");
			setVolume(10);
		}
	}
}
