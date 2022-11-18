package JavaStudy01;

/* 이항 연산자
  비교 연산자, 논리연산자(& | !)
  대입연산자는 방향이 다른 연산자와 반대 (오른쪽 -> 왼쪽)
  
  문자 char은 작은따옴표 ' '
  문자열 String은 큰따옴표 " "
  큰 따옴표는 문자가 1개여도 문자열로 취급!
  
  삼항 연산자
  조건식 ? true일 때 값 : false일 때 값
 */

public class Java06 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		
		System.out.println("result4 = " + result4);

	
		System.out.println("---------------------");
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println(v4 == v5); // double이 정확도가 float에 비해 높다 / 사이즈가 다르며 내부적으로 봤을 때는 같지 않다고 뜸
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
		
		
		
		int charCode = 'A'; //65
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자입니다.");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자입니다.");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 사이 숫자입니다.");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수입니다.");
		}	
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수입니다.");		
		}
		
		int result = 10;
		
		System.out.println("변수 result : " + result);
		
		result = result + 1;
		System.out.println("result + 1 = " + result);
		
		result += 1;
		System.out.println("result += 1 적용  --> " + result);
		
	}

}
