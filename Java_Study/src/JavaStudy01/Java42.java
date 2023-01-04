package JavaStudy01;

/*
예외 떠넘기기
throws
메서드 선언부에 작성
리턴타입 메서드명(매개변수1 ...) throws 예외클래스1, 예외클래스2 ... {}
throws를 하면 함수 선언부에서 예외처리를 하지 않고 메서드가 호출된 곳에서 예외처리를 하도록 예외를 떠넘길 수 있다
-> 장점 : throws를 사용하면 각각의 메서드에서 예외처리 하던 것을 한 곳에서 예외처리할 수 있음! 소스코드를 간소화할 수 있음!

사용자 정의 예외
자바 표준 API에서 제공하지 않는 예외
ex> 애플리케이션 서비스와 관련된 예외
   잔고 부족, 계좌 이체 실패, 회원 가입 실패 등
사용자 정의 예외 클래스 선언 방법 예시
public class XXXXException extends [ Exception | RuntimeException ] {
	public XXXXException() {}
	public XXXXException(String message) { super(message); }
}

예외 발생 시키기
코드에서 예외를 발생시키는 방법
throw 사용!
사용 방법
throw new XXXException();
*/

public class Java42 {

	public static void main(String[] args) {
		System.out.println("----- main 메서드 -----");
		
		try {
			method1(10, 0);
		}
		catch(Exception e) {
			System.out.println("연산 시 오류 발생 in method1");
		}
		
		System.out.println("\n----- main 메서드 정상 실행 완료 -----\n");

		
		
		
		System.out.println("\n\n");
		
		Java42_2 account = new Java42_2();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.Withdraw(30000);
		}
		catch (Java42_1 e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
		
		System.out.println("\n\n");
	}

	public static void method1(int a, int b) throws Exception {
		System.out.println("\n----- method1 -----\n");
		
//		try {
//			int result = 0 ;
//			result = a / b;
//			System.out.println("method1의 result 값 : " + result);
//		}
//		catch (Exception e) {
//			System.out.println("연산 시 오류 발생 in method1");
//		}
	
		int result = 0 ;
		result = a / b;
		System.out.println("method1의 result 값 : " + result);
			
		System.out.println("\n----- method1 정상 실행 완료 -----\n");
	}
	
}
