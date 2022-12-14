package JavaStudy01;

/*
 final 필드
 최종적인 값을 갖고 있는 필드로 값을 변경할 수 없음!
 딱 한번의 초기값 지정이 가능하다!
 초기화 이후 읽기 전용!
 */

public class Java22 {

	public static void main(String[] args) {
		Java22_1 p1 = new Java22_1("123456-1234567", "홍길동");
		
		System.out.println("국적 : "+ p1.nation);
		System.out.println("주민번호 : "+ p1.ssn);
		System.out.println("이름 : "+ p1.name);

//		p1.nation = "USA";
//		p1.ssn = "192837-5647321";
		p1.name = "임꺽정";
		
		System.out.println("이름 : "+ p1.name);
	}

}
