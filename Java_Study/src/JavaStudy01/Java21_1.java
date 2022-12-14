package JavaStudy01;

public class Java21_1 {
//	해당 클래스의 객체를 클래스 내부에서 생성
//	private도 내부에서는 접근이 가능하다!
//	생성된 객체에 private 접근제한자를 사용해 외부에서 사용할 수 없도록 막은 것!
//	But, 정적멤버는 객체 생성 없이 클래스명을 접근이 가능하며 데이터를 공유할 수 있음!
	private static Java21_1 singleton = new Java21_1();
	
//	생성자에 접근제한자 중 private를 사용해서 외부에서 접근할 수 없도록 막음 
//	생성자를 호출할 수 없으므로 객체를 생성할 수 없음
	private Java21_1() {	//private는 외부에서 접근 불가능!
		
	}
	
//	정적 멤버로 메서드를 생성
//	반환 타입을 해당 클래스 타입으로 설정하여 내부에서 생성된 객체를 외부로 전달할 수 있음
//	정적 멤버이므로 정적 멤버인 singleton 객체를 새로 생성하지 않고 기존에 생성된 singleton 객체를 외부로 전달!
	static Java21_1 getInstance() {
		return singleton;
	}

	
}
