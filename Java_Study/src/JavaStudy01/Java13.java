package JavaStudy01;

import java.util.Scanner;

/*
 배열
 하나의 변수명으로 동일한 타입의 데이터를 여러개 저장하는 데이터 타입
 같은 타입의 데이터를 연속된 공간에 저장하는 자료 구조
 각 데이터 저장 위치는 인덱스를 통해 접근!
 첫번째 데이터 저장 위치는 인덱스 0 (0부터 시작)
 
 배열의 장점
 중복된 변수 선언을 줄일 수 있음
 반복문을 이용해 요소들을 쉽게 처리
 
 배열 선언
 타입[] 변수; or 타입 변수[];
 보통은 후자를 많이 사용한다!
 ex> int intArray[];
 배열 변수를 생성만 한 것!
 
 값 목록으로 배열을 생셩하는 방법
 1. 변수 선언과 동시에 값을 대입
   ex> 데이터타입 변수[] = {값0,값1,...}
 2. 변수 선언 후 값 목록 대입
   ex> 데이터타입 변수[];
       변수 = new 타입[]{값0, 값1, 값2,...}
 3. 향후 값들을 저장할 배열을 미리 생성
   ex> 데이터타입 변수 = new 타입[길이];
       데이터타입 변수[] = null;
       변수 = new 타입[길이];
       
 배열 사용 방법
 배열명[인덱스] = 데이터; // 지정한 index에 데이터 저장
 배열명[인덱스]; // 지정된 인덱스에 저장된 데이터 출력
 
 배열 사용 시 주의사항
 1. 배열 선언 시 지정한 크기를 넘어서는 인덱스에는 접근할 수 없다
 2. 배열의 인덱스는 0번부터 시작
 3. 배열 사용 시 []를 사용함
 4. 한번 선언된 배열은 크기를 변경할 수 없다
 
 배열은 일반변수와 동일함
 
 배열의 길이를 구하는 메소드
 배열변수.length;
 */

public class Java13 {

	public static void main(String[] args) {
//		1. 배열 선언과 동시에 데이터 입력
		int scores1[] = {90,80,70,60,50};

//		2. 배열 변수만 먼저 선언 후 나중에 데이터 입력
		int scores2[];
		int[] scores2_2= null;
		
		scores2 = new int[] {10,20,30,40,50};
		scores2_2 = new int[] {50,60,70,80,90};
		
//		3. 배열 변수 및 크기를 먼저 선언 후 나중에 데이터 입력
		int scores3[] = new int[5];
		
		scores3[0] = 10;
		scores3[1] = 40;
		scores3[2] = 60;
		scores3[3] = 90;
		scores3[4] = 100;
		
		System.out.println(scores3[0]);
		System.out.println(scores3[1]);
		System.out.println(scores3[2]);
		System.out.println(scores3[3]);
		System.out.println(scores3[4]);
		System.out.println(scores3[0]+scores3[1]);
		System.out.println(scores3[4]-scores3[3]);
	
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum+=scores3[i];
		}
		System.out.println(sum);
		
		for(int i=0;i<5;i++) {
			System.out.println(scores2[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		//문제1> 이름은 numbers, int타입, 크기10인 배열을 생성하고, 원하는 숫자를 10개 입력한 후 출력
		int numbers[] = new int[10];
	
		for(int i=0;i<10;i++) {
			System.out.print(i+"번째 숫자를 입력하세요 >>> ");
			int input_num = sc.nextInt();
			numbers[i] = input_num;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("numbers["+i+"] : "+ numbers[i]);
		}
		
		
		//문제2> 이름은 numArr이고, 크기가 5인 int 타입의 배열 생성, 원하는 숫자를 입력한 후 반복문을 이용해 모든 내용 출력
		int[] numArr = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("배열 인덱스 "+i+"의 값 : ");
			int num = sc.nextInt();
			numArr[i] = num;
		}
		for(int i=0;i<5;i++) {
			System.out.print("numArr["+i+"] : "+ numArr[i] +"\t");
		}
		System.out.println("\n");		
		
		int[] numArr2 = new int[5];
		System.out.println(numArr2[0]);
		String[] strArr2 = new String[5];
		System.out.println(strArr2[0]);	

//		배열의 길이 구하기 / 배열이름.length;
		int size = numArr2.length;
		System.out.println(size);
		
		System.out.println(numbers.length);
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
