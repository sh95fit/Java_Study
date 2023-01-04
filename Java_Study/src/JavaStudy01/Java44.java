package JavaStudy01;

import java.util.ArrayList;
import java.util.List;

/*
 컬렉션 프레임워크
 
 컬렉션
 사전적 의미로 요소(객체)를 수집해 저장하는 것
 
 배열의 문제점
 저장할 수 있는 객체 수가 배열을 생성할 때 결정된다
 -> 불특정 다수의 객체를 저장하기에 문제
 객체를 삭재했을 때 해당 인덱스가 비어있게 되고 객체 저장 시 어디에 비어있는지 확인이 필요하다
 -> 자원 낭비 혹은 공간을 채우기 어려움
 
 컬렉션 프레임워크
 크기가 자동 조절되므로 크기 변경이 가능하다!
 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리
 java.util 패키지에 포함되어 있다!
 인터페이스를 통해 정형화된 방법으로 다양한 컬렉션 클래스 사용
 단점 - 배열에 비해 속도가 느리다!
 
 컬렉션 프레임워크 주요 인터페이스
 컬렉션 하위 -> List 계열(ex> ArrayList)	- 순서 유지, 중복 저장 가능
 		    Set 계열(ex> HashSet) - 순서 x, 중복 저장 안됨
 + Map 계열(HashMap) - 키와 값의 쌍으로 저장, 키는 중복 불가
 
 
 List 컬렉션
 
 특징
 인덱스로 관리
 중복해서 객체 저장 가능
 크기 조절 가능! (외에 배열과 유사)
 비슷한 유형의 데이터 저장에 특화
 
 구현 클래스
 ArrayList
 Vector
 LinkedList
 
  
 
 */



public class Java44 {

	public static void main(String[] args) {

//		ArrayList
//		부모 클래스 타입 형태
		List<String> list1 = new ArrayList<>();
//		자식 클래스 타입 형태
		ArrayList<String> list2 = new ArrayList<>();
		
		list1.add("Java");
		list1.add("JDBC");
		list1.add("Servlet/JSP");
		list1.add(2, "Database");
		list1.add("MyBatis");
		
		int size = list1.size();
		
		System.out.println("list1 총 크기 : " + size);
		System.out.println();
		
		String skill = list1.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for (int i=0; i<list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list1.remove(2);
		list1.remove(2);
		list1.remove("MyBatis");
		
		for (int i=0; i<list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(i + " : " + str);
		}
		
	}

}
