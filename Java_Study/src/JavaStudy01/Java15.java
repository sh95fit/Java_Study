package JavaStudy01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 컬렉션 - 하나의 변수명으로 여러 개의 데이터 저장 기능 (인덱스가 없음!)
 
 인덱스가 없는 경우
 -> 향상된 for문 사용
	: 배열 및 컬렉션의 항목 요소를 순차적으로 처리
	  인덱스를 이용하지 않고 바로 항목 요소 반복 / But, 무조건 처음부터 끝까지 출력 (시작하는 숫자를 정하지 못함)
	  조건식이 없음!! 무조건 처음부터 끝까지 출력
	  
	형태
	
	for(타입 변수 : 배열or컬렉션){
		실행문
	}
 */


public class Java15 {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for(int score : scores) {
			sum = sum + score;
			System.out.println("score : " + score);
		}
		
		System.out.println(sum);
		
		// HashMap : 컬렉션 데이터 타입 중 하나로 index가 없으므로 향상된 for문을 사용해 데이터를 출력해야한다.
		Map<String, String> map = new HashMap<String, String>();	// HashMap<> 으로 String을 생략할 수 있다!
		map.put("이름", "홍길동");
		map.put("직업", "가수");
		map.put("성별", "여성");
		map.put("주소", "서울");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("직업"));
		System.out.println(map.get("성별"));
		System.out.println(map.get("주소"));
		
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
