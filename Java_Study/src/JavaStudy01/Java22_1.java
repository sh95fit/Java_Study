package JavaStudy01;

public class Java22_1 {
//	final 키워드를 사용한 필드는 읽기 전용
//	즉 초기화 1회에 한해서만 지정이 가능하다!
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Java22_1(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
