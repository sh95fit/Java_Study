package JavaStudy01;

/*
 while문
 조건에 따라 반복을 계속할지 결정할 때 사용
 조건식이 true인 경우 계속 실행하다가 조건식이 false가 되면 while 루프를 탈출
 
 while문 사용 시 주의사항!
 1. 카운트 변수를 while문 외부에 생성해야함!
 2. 카운트 변수의 값을 while 내부에서 연산해야함(증감!)
 3. while문을 중지할 수 있는 로직을 반드시 마련해야 함! (무한 루프 방지)
 4. 카운트 연산의 위치에 따라 출력되는 결과가 달라짐
 5. 2개 이상의 while문을 연달아 사용 시 카운트 변수의 이름이 동일하면 
    1개의 while문 종료 후 카운트 변수 값을 반드시 초기화!
 
 count = 0;  //조건식을 탈출하기 위한 카운트 값 지정
 while(조건식){
 	실행문;
 	카운트(증감 연산 반영)
 }
 
 do~while문 형태
 do {
 	실행문;
 }while(조건식);
 */

public class Java10 {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("---while문으로 1~10까지 출력---");
		while(i<=10) {
//			i++;  //11까지 출력
			System.out.println(i);
			if(i==10) {
				System.out.println("i = "+ i +" 충족 -> 루프 탈출");
			}
			i++;  //10까지 출력
		}
		
		i=0; //첫번째 while문에서 i가 증가되어 유지되므로 다음 while문 조건에 맞지 않을 수 있음	
		System.out.println("----동일한 변수의 while문----");
		while(i<11) {
			System.out.println("현재 i : "+i);
			i++;
		}
		System.out.println("----do~while문----");		
		//do~while : 무조건 1번은 while문을 실행할 때 사용(조건이 맞지 않아도 1회 실행!)
		do {
			System.out.println("현재 i : "+ i);
		}while(i<11);

	}

}
