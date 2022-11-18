package JavaStudy01;

import java.util.Scanner;

/*
 if문
 프로그램 실행 시 조건에 따라 다른 소스 코드를 실행함
 조건식 결과에 따라 코드 분기
 
 if(조건식1){
 	true일 때 실행
 }
 else if (조건식2) {
 	true일 때 실행
 }
 else {
 	위 조건들이 맞지 않을 경우 실행
 }
  
 */

public class Java07 {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 높습니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score<90) {
			System.out.println("점수가 90보다 낮습니다.");
			System.out.println("등급은 B 입니다.");
		}
		
		int money = 12000;
			System.out.println("중화요리점 서비스");
		if(money>=11000){
			System.out.println("군만두 추가");
		}
		
		int num = 95;
		
		if(num>=90) {
			System.out.println("점수가 90보다 높습니다.");
			System.out.println("등급 : A");
		}else {
			System.out.println("점수가 90보다 낮습니다.");
			System.out.println("등급 : B");
		}
	
		String menu = "짬뽕";
		
		System.out.println("중화요리 전문점 방문");
		
		System.out.println("메뉴 확인");
		
		//비교 연산자로 비교가 가능한 데이터는 기본 데이터 타입만 가능
		//문자열은 레퍼런스 타입이기 때문에 비교연산자로 연산 불가능
		//문자열의 비교는 전용 메서드를 사용하여 진행해야 함
		
		if(menu.equals("짬뽕")) {
			System.out.println("짬뽕 주문");
		}else {
			System.out.println("짜장면 주문");
		}
		
		//else if 활용
		
		int n = 75;
		
		if(n>=90) {
			System.out.println("점수가 90~100대 입니다.");
			System.out.println("등급 : A");
		}else if(n>=80) {
			System.out.println("점수가 80~89대 입니다.");
			System.out.println("등급 : B");
		}else if(n>=70) {
			System.out.println("점수가 70~79대 입니다.");
			System.out.println("등급 : C");
		}else {
			System.out.println("점수가 70 미만대 입니다.");
			System.out.println("등급 : D");
		}
		
		//문제1) 국어, 영어, 수학 점수의 평균을 구하고, 평균 점수를 기반으로 등급을 구하는 프로그램 작성
		// 조건 : 95이상 A+, 90이상 A, 85이상 B+, 80이상 B, 70이상 C, 60이상 D, 나머지 F(60미만)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 >>> ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 >>> ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 >>> ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math)/3;
		System.out.println("평균 : " + avg);
		
		if(avg>=95) {
			System.out.println("등급 : A+");
		}else if(avg>=90) {
			System.out.println("등급 : A");
		}else if(avg>=85) {
			System.out.println("등급 : B+");
		}else if(avg>=80) {
			System.out.println("등급 : B");
		}else if(avg>=70) {
			System.out.println("등급 : C");
		}else if(avg>=60) {
			System.out.println("등급 : D");
		}else{
			System.out.println("등급 : F");
		}
		
	}

		
}


