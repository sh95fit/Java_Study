package JavaStudy01;

/*
 
 정적(static) 멤버란?
 인스턴스(객체)를 생성하지 않고도 멤버 변수에 접근할 수 있다!
 정적 멤버는 데이터를 공유!
 클래스에 고정된 필드와 메소드 - 정적 필드, 정적 메소드
 정적 멤버는 클래스에 소속된 멤버
 -> 객체 내부에 존재하지 않고, 메소드 영역에 존재
    정적 멤버는 객체를 생성하지 않고 클래스로 바로 접근해 사용
 접근 방법
 클래스명.멤버변수명;
 클래스명.멤버메서드명();

 vs 인스턴스 멤버
 객체(인스턴스)마다 가지고 있는 필드와 메소드
 객체명.멤버변수명;
 객체명.멤버메서드명();
 
 인스턴스 멤버 선언 vs 정적 멤버 선언
 필드
 객체마다 가지고 있어야 할 데이터 -> 인스턴스 멤버
 공용적인 데이터(공유되어야할 데이터) -> 정적 필드
 
 메소드
 인스턴스 필드로 작업해야 할 메서드 -> 인스턴스 메서드
 인스턴스 필드로 작업하지 않는 메서드 -> 정적 메서드
  But, 정적 멤버는 연산 시 정적멤버만 사용 가능 <=> 인스턴스 멤버는 연산 시 인스턴스 및 정적 멤버를 모두 사용할 수 있음
  
 정적멤버 : 클래스의 멤버 프로그램 실행 시 클래스와 함께 메모리에 로드
 인스턴스멤버 : 객체 생성 시, 메모리에 등록됨
 
 정적 메소드와 정적 블록 작성 시 주의할 점
 객체가 없어도 실행 가능
 But, 블록 내부에 인스턴스 필드나 인스턴스 메소드는 사용할 수 없다!
 (객체가 생성되지 않았을 경우가 있으므로 연산에 필요한 인스턴스 멤버가 존재하지 않을 경우가 발생할 수 있음)
 객체 자기 자신을 참조하는 this를 사용할 수 없다!
 
 */

public class Java20 {

	public static void main(String[] args) {	// main 메서드가 정적 멤버였기 때문에 자동 실행이 가능함!
		Java20_1 t1 = new Java20_1();
		System.out.println("객체 t1의 value1 값 : " + t1.value1);
		System.out.println("객체 t1의 value2 값 : " + t1.value2);
		System.out.println("객체 t1의 value3 값 : " + t1.value3);
		System.out.println("객체 t1의 value4 값 : " + t1.value4);

//		정적 필드에 접근
		System.out.println("정적 멤버 value3 값 : "+ Java20_1.value3);
		System.out.println("정적 멤버 value4 값 : "+ Java20_1.value4);

//		인스턴스 멤버를 정적 멤버 접근방법으로 접근 시 에러 발생
//		System.out.println("인스턴스 멤버 value1 값 : " + Java20_1.value1);
//		System.out.println("인스턴스 멤버 value2 값 : " + Java20_1.value2);

//		객체를 통한 멤버 메서드 호출
		t1.sum();
		t1.sub();
		
//		클래스의 정적 멤버 메서드 호출
		Java20_1.sub();
		
//		sum() 메서드는 Java20_1 정적 멤버가 아니므로 클래스명으로 직접 접근이 불가능함
		
		System.out.println();
		
		Java20_1 t2 = new Java20_1();
		
		t1.value1 = 10;
		t1.value2 = 20;
		
		t2.value1 = 100;
		t2.value2 = 200;
		
		System.out.println("객체 t1의 value1 값 : " + t1.value1);
		System.out.println("객체 t1의 value2 값 : " + t1.value2);
		System.out.println("객체 t2의 value1 값 : " + t2.value1);
		System.out.println("객체 t2의 value2 값 : " + t2.value2);
		
		System.out.println("\nt1의 멤버 값 변경\n");
		
		t1.value1 = 1000;
		t1.value2 = 2000;
		
		System.out.println("객체 t1의 value1 값 : " + t1.value1);
		System.out.println("객체 t1의 value2 값 : " + t1.value2);
		System.out.println("객체 t2의 value1 값 : " + t2.value1);
		System.out.println("객체 t2의 value2 값 : " + t2.value2);
		
		System.out.println("t1과 t2의 정적멤버 값 확인");
		
		System.out.println("객체 t1의 정적 멤버 value3 값 : " + t1.value3);
		System.out.println("객체 t1의 정적 멤버 value4 값 : " + t1.value4);
		System.out.println("객체 t2의 정적 멤버 value3 값 : " + t2.value3);
		System.out.println("객체 t2의 정적 멤버 value4 값 : " + t2.value4);
		
		System.out.println("t1의 정적 멤버 데이터 수정\n");
		
		t1.value3 = 300000;
		t1.value4 = 400000;
		
		System.out.println("객체 t1의 정적 멤버");
		
//		정적 멤버는 클래스의 멤버이므로 메모리 공간이 하나로 되어 있음! (즉, 다른 인스턴스로 접근해서 변경을 하면 전체 인스턴스에 대한 값이 변경된다)
		System.out.println("객체 t1의 정적 멤버 value3 값 : " + t1.value3);
		System.out.println("객체 t1의 정적 멤버 value4 값 : " + t1.value4);
		System.out.println("객체 t2의 정적 멤버 value3 값 : " + t2.value3);
		System.out.println("객체 t2의 정적 멤버 value4 값 : " + t2.value4);
		System.out.println("클래스 Java20_1의 정적 멤버 value3 : " + Java20_1.value3);
		System.out.println("클래스 Java20_1의 정적 멤버 value4 : " + Java20_1.value4);
		
		
//		초기화 블록 확인
		System.out.println("Company : " + Java20_2.company);
		System.out.println("Company : " + Java20_2.model);
		System.out.println("Company : " + Java20_2.info);
	}

}