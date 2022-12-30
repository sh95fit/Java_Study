package JavaStudy01;

// 자식 클래스 1(인터페이스 구현 용도)
public class Java38_2 implements Java38_1 {

	// 상속 받은 추상 메서드 오버라이딩
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
	
}
