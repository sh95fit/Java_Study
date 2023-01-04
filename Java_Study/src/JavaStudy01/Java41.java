package JavaStudy01;

public class Java41 {

	public static void main(String[] args) {
		
		try(Java41_1 fis = new Java41_1("C:\\Users\\tpgns\\Desktop\\Hun's\\Hun's\\sh95fit_git\\Java_Study\\Java_Study\\src\\JavaStudy01\\Java40_3.txt")) {
			fis.read();
			throw new Exception();	//강제로 예외 발생
		}
		catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");	
		}
		
		System.out.println("정상 실행 완료");

		Java41_1 fis2 = null;
		
		try {
			fis2 = new Java41_1("C:\\Users\\tpgns\\Desktop\\Hun's\\Hun's\\sh95fit_git\\Java_Study\\Java_Study\\src\\JavaStudy01\\Java40_3.txt");
			fis2.read();
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");	
		}
		finally {
			if(fis2 != null) {
				try {
					fis2.close();	// 리소스 누수를 막기 위해 finally를 사용함!
				}
				catch (Exception e) {
				}
			}
		}
		
		System.out.println("정상 실행 완료");
		
		
		
	}

}
