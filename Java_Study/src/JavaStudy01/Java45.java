package JavaStudy01;



/*
 컬렉션 프레임워크
 
 List 계열
 순서 유지 + 중복 저장 가능
 인덱스로 관리
 데이터 추가/삭제가 가능!(배열의 크기 변경 불가를 보완)
 add, set, get, size, remove
 ex> ArrayList, Vector, LinkedList
 
 Vector : 스레드 동기화(synchronization)
 		  먼저 들어온 스레드가 작업이 끝나면 그 다음 스레드가 접근할 수 있도록 동기화가 되어 있음! (작업이 꼬이는 것을 방지)
 		  복수의 스레드가 동시에 Vector에 접근해 객체를 추가, 삭제하더라도 스레드에 안전(thread safe)
 
 * 스레드 : 프로그램(프로세스) 내에서 실제 연산을 진행하는 주체
 		  자바는 멀티 스레드 지원!
 		  일반 변수 사용 시 다중 스레드에 안전하지 않다 (Why? 동시에 실행하게 되므로 연산이 꼬일 수 있다!)
 
 LinkedList : 인접 참조를 링크해서 체인처럼 관리
 			  특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크만 변경
 			  빈번한 객체 삭제와 삽임이 일어나는 곳에는 ArrayList보다 성능이 좋다!
 
 Set 계열
 순서 x + 중복 저장 x
 ex> HashSet, TreeSet
 
 Map 계열
 키-값 쌍, (키는 중복되지 않음!)
 ex> HashMap, Hashtable, TreeMap, Properties
 */

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;


public class Java45 {

	public static void main(String[] args) {
		
//		Vector 예제
		List<Java45_1> list = new Vector<Java45_1>();
		
		list.add(new Java45_1("제목1","내용1","글쓴이1"));
		list.add(new Java45_1("제목2","내용2","글쓴이2"));
		list.add(new Java45_1("제목3","내용3","글쓴이3"));
		list.add(new Java45_1("제목4","내용4","글쓴이4"));
		list.add(new Java45_1("제목5","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i=0; i<list.size(); i++) {
			Java45_1 board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
//		ArrayList, LinkedList 성능 차이 비교
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 소요 시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime =System.nanoTime();

		System.out.println("LinkedList 소요 시간 : " + (endTime - startTime) + "ns");
		
	}

}
