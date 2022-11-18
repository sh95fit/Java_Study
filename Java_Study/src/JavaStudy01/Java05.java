package JavaStudy01;

/*
 연산자와 연산식
 연산자의 종류
 산술, 대입, 증감, 비교, 논리(!, &&, ||), 조건( (조건식)? A : B - 삼항연산자)
 
 연산자의 방향과 우선순위
 동일한 우선순위의 연산자는 연산의 방향 존재(좌 -> 우)  예외 : 대입연산자는 우측에 있는 값이 좌측에 대입
 우선순위 높음                우선순위 낮음
 증감 - 산술(*,/,%) - 산술(+,-) - 쉬프트 - 비교(<, >, <=, >=, instanceof) - 비교(==, !=) - 논리 - 조건 - 대입
 
 단항연산자 : ++ -- !
 이항연산자 : 대부분 연산자
 삼항연산자 : (조건식)? A : B
 
 산술연산자 사용 시 주의사항
 NaN과 Infinity 연산은 주의할 것
 결과값 산출 시 Overflow 주의
 
 문자열 연산자
 문자열과 문자열을 연결하여 하나의 긴 문자열 생성
 특징 : 문자열과 기본 타입을 +로 연산 시 모두 문자열로 변환된다!
 "" 큰따옴표 사이에 있는 모든 것은 문자열
 
*/


public class Java05 {

	
// main 메서드 : 프로그램의 시작이자 끝
	public static void main(String[] args) {
		int a = 100;
		int b = 30;
		
		int c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		c = a / b;
		System.out.println(c);
		
		c = a % b;
		System.out.println(c);
		
		
		System.out.println("----------------------------");
		
		String str1 = "Hello";
		String str2 = "Java Study";
		System.out.println(str2);
		System.out.println(str1);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		int num = 2150;
		str3 = str1 + str2 + num;
		System.out.println(str3);

		System.out.println("END " + "Study");
		
		str1 = "100";  // 숫자이지만 실제 데이터 타입은 문자열
		str2 = "200";  // 숫자이지만 실제 데이터 타입은 문자열
		//문자열은 숫자 연산이 불가능하다
		str3 = str1 + str2;
		System.out.println(str3);
		
		System.out.println("100" + 200);  // 문자열과 기본타입 연산 시 문자열로 자동 형 변환됨!

		
		//문자열 : 자바 언어에서 레퍼런스 타입으로 구성되어 있는 여러 개의 문자를 출력하기 위해 존재하는 데이터 타입
		//문자열은 워낙 많이 사용하기 때문에 레퍼런스 타입이지만 기본 타입처럼 사용함
		//자바 언어에서 " " 사이에 존제하는 데이터는 모두 문자열임
		//문자열 연결 연산자 + : 2개 이상의 문자열을 하나의 문자열로 연결하는 연산자
		//문자열과 다른 데이터 타입을 +로 연산할 경우 둘다 문자열로 변환됨
		//문자열 사용 방법 : String 변수명; (메모리 등록만 진행, 실제 데이터 없음, 사용 전 초기화 필수)
		              //String 변수명 = "문자열 데이터"; (가장 일반적인 방법, 선언과 함께 데이터 저장(초기 데이터 저장))
		              //String 변수명 = new String("문자열 데이터");
		
		String str5;
		String str6 = "JAVA 강의 3일차";
		String str7 = new String("문자열 연산자");
		
		str5 = "Home";
		
		System.out.println(str5);  // 초기화하지 않으면 에러 발생
		System.out.println(str6);
		System.out.println(str7);
		
		System.out.println();
		
		System.out.println(str5 + str6);
		
		System.out.println();
		
		System.out.println(2022 + " JAVA 수업");
		System.out.println("JAVA 수업" + 20 + 22);
		System.out.println("JAVA 수업" + 20 * 22);  //곱하기는 더하기보다 우선순위이므로 숫자 연산 후 문자열 연산이 이루어진다
	}

}
