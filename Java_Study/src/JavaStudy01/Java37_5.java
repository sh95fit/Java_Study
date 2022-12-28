package JavaStudy01;

// 인터페이스 다중 상속
public class Java37_5 implements Java37_1, Java37_4 {
	private int volume;

//	인터페이스 Java37_4에서 상속 받은 추상 메서드
	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

//	인터페이스 Java37_1에서 상속 받은 추상 메서드
	@Override
	public void turnOn() {
		System.out.println("Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off");	
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Java37_1.MAX_VOLUME) {
			this.volume = Java37_1.MAX_VOLUME;
		}
		else if (volume > Java37_1.MIN_VOLUME) {
			this.volume = Java37_1.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 볼륨은 " + volume + "입니다.");
		
	}

}
