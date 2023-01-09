package JavaStudy01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map 컬렉션
 키와 값으로 구성된 Map.Entry 객체를 저장하는 구조
 키와 값은 모두 객체이며 키는 중복될 수 없고 값은 중복될 수 있다!
 put(K key, V value), remove(Object key), get(Object key), size(), isEmpty(), containsKey(Object key), containsValue(Object value)
 
 HasnMap 형태
 -> Map<K, V> map = new HashMap<K, V>();
 ex> HashMap, Hashtable, LinkedHashMap
 */

public class Java47 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("아이유", 90);
		map.put("유재석", 80);
		map.put("원빈", 70);
		map.put("제니", 85);
		
		System.out.println("총 크기 : " + map.size());
		
		System.out.println("\t아이유 : " + map.get("아이유"));
		System.out.println();
		
		Set<String> keySet = map.keySet();	// 키값을 모아 set타입의 변수에 저장
		Iterator<String> iter = keySet.iterator(); //set 타입의 변수를 반복이 가능한 iterator 타입을 변
		
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("유재석");
		System.out.println("총 크기 : " + map.size());
		
		map.clear();
		System.out.println("총 크기 : " + map.size());

	}

}
