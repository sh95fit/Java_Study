package JavaStudy01;

public interface Java35_1 {
//	상수 선언 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	추상 메서드(자식 클래스에서 반드시 구현해야함)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	디폴트 메서드 선언
//	상속 시 자식클래스에서 구현하지 않아도 사용할 수 있는 메서드
//	디폴트 메서드는 상속 받은 자식 클래스에서 필요에 따라 오버라이딩을 하면 된다
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음을 해제합니다.");
		}
	}
}
