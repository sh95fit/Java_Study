package JavaStudy01;


// 추상 클래스 Animal
// 추상 메서드가 하나라도 존재하면 반드시 추상 클래스로 지정해주어야 한다! (일반 클래스로 선언하면 에러 발생)
public abstract class Java33_3 {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
//	추상 메서드
//	코드 블럭이 없음!
	public abstract void sound();
}
