package JavaStudy01;

/*
 예외 처리
 
 오류의 종류
 에러
 - 관리되지 않는 오류
 - 하드웨어의 잘못된 동작 또는 고장으로 인한 오류
 - 에러가 발생되면 프로그램 종료
 - 정상 실행 상태로 돌아갈 수 없음
 
 예외
 - 관리할 수 있는 오류
 - 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 오류
 - 예외가 발생되면 프로그램 종료
 - 예외 처리를 추가하면 정상 실행 상태로 돌아갈 수 있음
 
 예외의 종류
 일반(컴파일 체크) 예외
 - 예외 처리 코드가 없으면 컴파일 오류 발생
 
 실행 예외
 - 예외 처리 코드를 생략하더라도 컴파일이 되는 예외
 - 경험에 따라 예외 처리 코드 작성 필요
 
 예외 클래스
 java.lang.Exception
 일반(컴파일러 체크) 예외 + 실행 예외
 
 ex>
 NullPointerException
 null 값을 갖는 참조변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생
 ArrayIndexOutOfBoundsException
 배열에서 인덱스 범위를 초과하여 사용할 경우 발생
 ClassCastException
 타입 변환이 되지 않을 경우 발생
 
 예외 처리 코드(try-catch-finally)
 예외 처리 시 프로그램 종료를 막고, 정상 실행을 유지할 수 있도록 처리
 try {
 	예외 발생이 가능한 코드
 }
 catch(예외클래스 e) {
 	예외 처리
 }
 finally {
 	항상 실행
 }
 
 다중 catch
 예외 별로 예외 처리 코드를 다르게 구현할 수 있다!
 try{
 }
 catch(ArrayIndex... e) {
 	예외 처리 1
 }
 catch(NumberFormat... e) {
 	예외 처리 2
 }
 
 
 멀티 catch
 자바 7부터 하나의 catch 블록에 여러개의 예외처리가 가능하다
 try{
 }
 catch(예외 클래스1 | 예외 클래스2 e){
 }
 
 
 finally 구문
 예외 발생과 상관없이 실행
 자바의 내부 리소스의 경우 자동 삭제
 But, 외부 리소스는 메모리 자동 삭제가 되지 않는다 (ex> 파일, 네트워크 연결 등)
 예외가 발생하면 finally를 활용해 리소스를 닫아주는 역할!
 
 
 
 try-with-resources
 finally의 번거로움을 해소해줌
 예외 발생 여부와 상관없음
 사용했던 리소스 객체의 close() 메소드를 자동으로 호출해 리소스를 닫는다
 리소스 객체
 각종 입출력스트림, 서버소켓, 소켓, 각종 채널
 java.lang.AutoCloseable 인터페이스를 구현하고 있어야한다
 */

public class Java40 {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		ArrayIndexOutOfBoundsExceptionException
//		args로 추가된 옵션은 1개이나 실제로 2개의 index가 사용되어 에러 발생
//		예전 방식 - if를 통한 예외를 처리하는 방식
//		아닌 경우 예외 클래스 활용
		
//		예전 방식 
		if (args.length == 2 ) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		}
		// 예외 처리
		else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionException");
			System.out.println("값1, 값2");
		}
		
		
		
//		현재 방식
		System.out.println("----- 프로그램 시작 -----\n");
		
//		예외 처리를 하지 않으면 에러 발생
//		Class clazz = Class.forName("java.lang.String2");
//		System.out.println("----- 프로그램 정상 실행 완료 -----");
		
		try {
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("----- 프로그램 정상 실행 완료 -----");
		}
		catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		System.out.println("\n----- 프로그램 정상 종료!! -----\n");
		
		
//		다른 예시 - ArrayIndexOutOfBoundsException
//		다중 catch
		System.out.println("----- 프로그램 시작 -----\n");
		
		String[] arr = new String[3];
		
		try {
			Class clazz = Class.forName("java.lang.String2");
			
			arr[0] = "10";
			arr[1] = "20";
			arr[2] = "30";
			arr[3] = "40"; // 오류 발생
			
			String data1 = null;
			System.out.println(data1.equals("문자열"));	// 오류 발생
			
			System.out.println("----프로그램 정상 실행 완료-----");
		}
//		상위 클래스가 아래에 위치해야 오류가 나지 않는다!
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		catch (Exception e) {
			System.out.println("다중 처리");
		}
		
		System.out.println("\n----- 프로그램 정상 종료!! -----\n");
		

//		다중 catch를 적용하지 않는 경우
		String data3 = null;
		String data4 = null;
		
		try {
			data3 = args[0];
			data4 = args[1];
			System.out.println("data3 = " + data3);
			System.out.println("data4 = " + data4);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatch2 num1 num2");
		}
		
		try {
			int value3 = Integer.parseInt(data3);
			int value4 = Integer.parseInt(data4);
			int result = value3 + value4;
			System.out.println(data3 + " + " + data4 + " = " + result);
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally {
			System.out.println("다시 실행하세요");
		}
		
		System.out.println("\n 프로그램 정상 실행 완료\n");
		
		
//		다중 catch
		try {
			String data5 = args[0];
			String data6 = args[1];
			System.out.println("data5 = " + data5);
			System.out.println("data6 = " + data6);
			int value5 = Integer.parseInt(data5);
			int value6 = Integer.parseInt(data6);
			int result = value5 + value6;
			System.out.println(data5 + " + " + data6 + " = " + result);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatch3 num1 num2");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		catch (ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("다시 실행하세요");
		}
		
		System.out.println("\n----- 프로그램 정상 실행 완료 -----\n");
		
		
		
//		ClassCastException
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
//		예전 방식
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
		else {
			System.out.println("잘못된 변환입니다.");
		}
		
	}
	
}

class Animal {}
class Dog extends Animal {};
class Cat extends Animal {};