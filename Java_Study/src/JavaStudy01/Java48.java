package JavaStudy01;

import java.io.FileReader;
import java.net.URLDecoder;

/*
 Map 컬렉션
 - Properties
   키와 값을 String 타입으로 제한한 Map 컬렉션
   Properties는 프로퍼티(~.properties) 파일을 읽어 들일 때 주로 사용
   * 프로퍼티 타입
     옵션 정보, 데이터베이스 연결 정보, 국제화(다국어) 정보를 기록
     애플리케이션에서 주로 변경이 잦은 문자열을 저장 - 유지보수 용이
     키와 값이 '=' 기호로 연결되어 있는 텍스트 파일 - ISO 8859-1 문자셋으로 저장, 한글은 유니코드로 변환되어 저장
   만드는 방법
   Other... -> General -> File 생성(.properties 확장자로 생성)
 */



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Java48 {

	public static void main(String[] args) {
//		HashMap 예시
		Map<Java48_1, Integer> map = new HashMap<>();
		
		map.put(new Java48_1(1, "아이유"), 95);
		map.put(new Java48_1(1, "아이유"), 95);
		
		System.out.println("총 개수 : " + map.size());

		
		System.out.println("\n\n");
		
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("spring", "12");
		map1.put("summer", "123");
		map1.put("fall", "1234");
		map1.put("winter", "12345");
		
		
		
//		Hashtable 예시
		Map<String, String> map2 = new Hashtable<>();
		
		map2.put("spring", "12");
		map2.put("summer", "123");
		map2.put("fall", "1234");
		map2.put("winter", "12345");
		
		
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (map2.containsKey(id)) {
				if (map2.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		};
		
		
//		Properties 파일 적용
		Properties properties = new Properties();
		String path = Java48.class.getResource("Java48.properties").getPath();
		
		try {
//			URLEncoder : 경로를 컴퓨터가 알아 볼 수 있는 방식으로 변환
//			URLDecoder : 경로를 사용자가 알아 볼 수 있는 방식으로 변환
			path = URLDecoder.decode(path,"utf-8");
			properties.load(new FileReader(path));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			System.out.println("driver : " + driver);
			System.out.println("url : " + url);
			System.out.println("username : " + username);
			System.out.println("password : " + password);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
