package JavaStudy01;

import java.util.Scanner;
/*
 for문
 반복 횟수를 알고 있을 때 주로 사용!
 
 for(초기화식;조건식;증감식){
 	실행문;
 }
 조건이 false일 때 벗어남!
 
 */

public class Java09 {

	public static void main(String[] args) {
		System.out.println("-----문제1-----");
		//문제 1> 1~100까지를 출력하는 프로그램을 작성하세요
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}		
		
		System.out.println("-----문제2-----");
		//문제 2> 반복문을 사용하여 1~10까지의 총합을 구하는 프로그램을 작성하세요
		int sum = 0;
		for(int i=1;i<=10;i++){
			sum +=i;
		//	System.out.println(i);
		}
		System.out.println("합계 : "+sum);

		System.out.println("-----문제3-----");
		//문제 3> 키보드로 숫자 하나를 입력 받아 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요 >>> ");
		int num = sc.nextInt();
		System.out.println("----"+num+"단----");
		int result = 0;
		for(int i=1;i<10;i++) {
			result = num*i;
			System.out.println(num+" * "+i+" = "+result);
		}
		
	}
}
