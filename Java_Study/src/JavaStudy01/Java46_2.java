package JavaStudy01;

import java.util.HashSet;
import java.util.Set;

public class Java46_2 {

	public static void main(String[] args) {
		Set<Java46_1> set = new HashSet<>();
		
//		데이터 값이 같은지 상속받은 Java46_1의 equals(), hashCode() 메서드에서 확인하여 동일하면 메모리 위치와 상관없이 중복처리!
		set.add(new Java46_1("아이유", 30));
		set.add(new Java46_1("유인나", 32));
		set.add(new Java46_1("아이유", 30));
		
		System.out.println("총 객체 수 : " + set.size());

		
//		클래스를 인스턴스화(객체 생성)하면 동일한 데이터를 입력하더라도 서로 다른 메모리에 존재하므로 서로 다른 것으로 인식!
		Set<Java45_1> set2 = new HashSet<Java45_1>();
		set2.add(new Java45_1("제목1", "내용1", "글쓴이1"));
		set2.add(new Java45_1("제목1", "내용1", "글쓴이1"));
		set2.add(new Java45_1("제목1", "내용1", "글쓴이1"));
		
		System.out.println("총 객체 수 : " + set2.size());
	}

}
