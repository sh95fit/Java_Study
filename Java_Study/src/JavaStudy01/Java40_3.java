package JavaStudy01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

// try-with-resources
// (자동 리소스 닫기! 즉 close() 메서드를 호출해 리소스를 닫을 필요가 없음!)
// finally의 번거로움을 해소해줌
// 예외 발생 여부와 상관없음
// 사용했던 리소스 객체의 close() 메소드를 자동으로 호출해 리소스를 닫는다
// 리소스 객체
// 각종 입출력스트림, 서버소켓, 소켓, 각종 채널
// java.lang.AutoCloseable 인터페이스를 구현하고 있어야 한다


public class Java40_3 {

	public static void main(String[] args) {
		FileInputStream input = null;
		
//		외부 리소스 사용을 위해 예외 처리 구문 사용
		try {
			File file = new File("C:\\Users\\tpgns\\Desktop\\Hun's\\Hun's\\sh95fit_git\\Java_Study\\Java_Study\\src\\JavaStudy01\\Java40_3.txt");
//			FileReader filereader = new FileReader(file);
//			BufferedReader bufReader = new BufferedReader(filereader);
//			String line = "";
//			while ((line = bufReader.readLine()) != null) {
//				System.out.println(line);
//
//			}
//			bufReader.close();
			input = new FileInputStream(file);
			
			int i = 0;
			
			while ((i = input.read()) != -1) {
				System.out.write(i);
			}
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			if (input != null) {
				try {
					input.close();
				}
				catch (Exception e) { }
			}
		}

	}

}
