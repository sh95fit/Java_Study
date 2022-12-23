package JavaStudy01;


// 인터페이스는 상수 필드만 선언 가능!!
// 즉 static final 형태
// 상수명은 대문자로 작성하며 선언과 동시에 초기값을 지정해야한다
public interface Java34_1 {

// 인터페이스의 멤버
// 정적멤버(상수, 정적 메서드)
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
// 추상 메서드 (public abstract를 생략해도 인터페이스에서는 컴파일 시 자동으로 붙는다
	void turnOn();
	public void turnOff();
	public abstract void setVolume(int volume);
// default 메서드
	
}
