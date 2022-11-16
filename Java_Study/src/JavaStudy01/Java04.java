package JavaStudy01;

/*
변수란?
하나의 데이터만 저장할 수 있는 메모리 공간
신규 데이터 저장 시 기존 데이터 삭제

* 한번 선언된 변수는 계속 사용이 가능하다(메모리 공간에 할당되어 있음)

 변수 명명 규칙
 - 첫번째 글자는 영어이거나 $, _ 외 다른 특수문자에는 사용할 수 없다! (숫자, 미해당 기호로 사용불가)
 - 영어 대소문자가 구분된다
 - (관례) 첫문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫자를 대문자로 한다.
 - 문자 수(길이)의 제한은 없다
 - 자바 예약어는 사용할 수 없다.

변수 선언
타입(자료형) 변수명;  // 변수를 선언만 함
타입 변수명 = 데이터  // 선언과 동시에 데이터 저장(초기화)

자료형 종류 : int, float, double, char, string 등

변수 사용 방법
변수명 (변수에 저장되어 있는 데이터를 가져오기)  or 변수명 = 데이터; (기존 변수에 새로운 데이터 저장)

리터럴(literal) 데이터 그 자체
소스코드 내에서 직접 입력된 변수 초기값
종류 : 정수 리터럴, 실수 리터럴, 문자 리터럴, 문자열 리터럴, 논리 리터럴

변수의 사용 범위
변수는 중괄호 블록 {} 내에서 선언되고 사용 (중괄호 {} = 코드 블록)
변수는 선언된 코드블록 내에서만 존재한다!
if블록, for블록에서 선언된 변수는 해당 블록 내에서만 유효

데이터 타입
기본(primitive) 타입
정수, 실수, 문자, 논리 리터럴을 직접 저장하는 타입
메모리의 최소 기억단위인  bit가 모여 byte 형성
1byte = 8bit

메모리 사용 크기
정수
byte 1byte / char 2byte(숫자(아스키코드), 정수, 문자) / short 2byte / int 4byte (기본타입) / long 8byte (long 타입 사용시 숫자 뒤 L을 붙여줘야 한다)
실수
float 4byte (float 타입 사용시 숫자 뒤 F를 붙여줘야 한다) / double 8byte (기본타입)
논리
boolean 1byte

타입 변환
데이터 타입을 다른 타입으로 변환하는 것
종류
자동(묵시적) 타입 변환 : Promotion (작은 사이즈에서 큰 사이즈로 가는 경우)
강제(명시적) 타입 변환 : Casting (큰 사이즈에서 작은 사이즈로 가는 경우)

연산식에서 자동 타입 변환
서로 다른 타입의 피연산자는 같은 타입으로 변환
두 피연산자 중 크기가 큰 타입으로 자동 변환

상수란?
변경되지 않는 수


*/


public class Java04 {

	public static void main(String[] args) {
		//변수 선언 - 데이터타입 변수이름;  or 데이터타입 변수이름 = 데이터;
		//변수 사용 방법 : 변수명;
		
		int a;  // 메모리에 변수 선언만 이루어짐, 데이터가 없으므로 쓰레기값이 출력된다
		int b = 20; // 변수 선언과 동시에 초기화(변수에 데이터를 처음 저장하여 사용할 준비를 완료함)
		
		a = 10;  // 변수 a 초기화함
		
		System.out.println(a);
		System.out.println(b);
		
		a = 100;
		b = 100;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = a + b;
		
		System.out.println(c);
		
		System.out.println("--------------");
		// 자동 타입 변환
		// 크기가 작은 데이터 타입에서 크기가 큰 데이터 타입으로 변환되는 것
		// Java 컴파일러가 자동으로 변환
		byte bValue1 = 50;
		byte bValue2 = 100;
		byte bResult = (byte)(bValue1 + bValue2);  //byte타입 -128~127이므로 127을 넘어가면 오버플로우 발생 -128로 넘어가서 증가
												   //Java의 기본 데이터 타입은 정수-int, 실수-double!!!
		                                           // -> 데이터 상관 없이 정수 연산 시 기본 데이터 타입인 int형으로 자동 타입 변환 후 연산 실행
												   // 즉 byte + byte 형태가 int + int로 변환되어 연산되므로 byte 타입으로 강제 형변환 필요
		int iResult = 0;
		System.out.println(bValue1);
		System.out.println(bValue2);
		System.out.println(bResult); //오버플로우 결과값
		iResult = bValue1 + bValue2;			   // 자동 타입 변환 발생
		System.out.println("--------------");		
		System.out.println(iResult);
		byte bValue = 10;
		int iValue = bValue;
		System.out.println(iValue);
		
		char charValue = 'a';
		iValue = charValue;
		System.out.println(iValue);
		
		iValue = 500;
		long lValue = iValue;
		System.out.println(lValue);
		
		iValue = 500;
		double dValue = iValue;
		System.out.println(dValue);

		System.out.println("--------------");
		// 강제 타입 변환
		// 크기가 큰 데이터 타입에서 크기가 작은 데이터 타입으로 변환되는 것
		// Java 컴파일러가 자동으로 변환하지 않으므로 사용자가 직접 변환해줘야 함
		iValue = 44032;
		charValue = (char)iValue;  //강제 타입 변환 방법 : 작은 타입의 변수 = (작은 타입) 큰 타입의 데이터
		System.out.println(charValue);  // char 타입은 정수(아스키코드)를 문자로 보여줌
		
		lValue = 500L;
		iValue = (int) lValue;
		System.out.println(iValue);
		
		dValue = 3.14;
		iValue = (int) dValue;
		System.out.println(iValue);

		System.out.println("--------------");
		
		double dResult = 0.0;
		int iValue1 = 10;
		double dValue1 = 5.5;
		
		dResult = iValue1 + dValue1;
		System.out.println(dResult);
	}

}
