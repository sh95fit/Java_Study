package JavaStudy01;

/*
 컬렉션 프레임워크
 
 Set 계열
 수학의 집합에 비유
 순서 x 즉, 저장 순서가 유지되지 않음
 중복 저장이 불가능!
 하나의 null만 저장 가능
 add(E e), isEmpty(), iterator(), size(), clear(), remove(Object o)
 ex> HashSet
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Java46 {
	
	public static void main(String[] args) {
//		HashSet 예시(Set 인터페이스 타입의 변수 set에 자식 클래스인 HashSet 타입 객체를 지정
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");	// 중복되는 값은 반영되지 않음!
		set.add("MYBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String element = iter.next();	// 실제로 데이터를 가져옴! + 기준이 다음으로 넘어감
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("MYBATIS");
		
		System.out.println("총 객체 수 : " + set.size());
		
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어있음!");
		}
	}
}