package JavaStudy01;

/*
 상속(Inheritance)
 자식(하위, 파생) 클래스가 부모(상위) 클래스의 멤버를 물려 받는 것
 자식 클래스가 부모 클래스를 선택해서 물려 받는다
 상속 대상 : 부모 클래스의 필드와 메서드
 부모 클래스를 재사용해 자식 클래스를 빠르게 개발할 수 있음
 코드의 중복을 줄일 수 있음
 유지 보수가 편리함
 객체 다형성 구현이 가능함
 상속 제한 대항 : 부모 클래스의 private 접근 제한자를 갖는 필드와 메소드 제외 + 부모 클래스가 default 접근 제한자를 갖는 다른 패키지에 있는 필드와 메소드 제외
 -> 즉 public, protected 접근제한자로 생성된 필드, 메서드만 상속 가능!
 
 extends 
 자식 클래스에서 상속 받고 싶은 부모 클래스를 지정하는 키워드
 ex> class 자식 클래스 extends 부모클래스 {}
 자바는 단일 상속 - 부모 클래스 여러개 상속 불가! (다중 상속 불가)
 
 Tip!
 어노테이션(Annotation)
 프로그램에서 추가적인 정보를 제공해주는 메타데이터
 용도
 컴파일러에게 코드 작성 문법에 대한 에러를 체크하도록 정보 제공
 소프트웨어 개발 툴이 빌드되거나 배치될 때 코드를 자동 생성할 수 있도록 정보 제공
 실행 시(런타임 시) 특정 기능이 실행되도록 정보 제공
 */

public class Java26 {

	public static void main(String[] args) {
		Java26_1 a = new Java26_1();
		System.out.println("클래스 a의 field1 : " + a.field1);
		a.method1();
		
		Java26_2 b = new Java26_2();
		System.out.println("클래스 b의 field2 : " + b.field2);
		b.method2();
	
//		상속 활용 하나의 클래스로 2가지 모두 출력
		System.out.println("클래스 b의 field1 : " + b.field1);
		b.method1();


	
		Java26_4 dcp = new Java26_4("자바폰", "검정", 10);
		
//		Java26_3에서 상속 받은 필드 사용
		System.out.println("모델 : " + dcp.model);
		System.out.println("색상 : " + dcp.color);
//		Java26_4가 자체적으로 존재하는 필드 사용
		System.out.println("채널 : " + dcp.channel);
		
//		Java26_3에서 상속 받은 메서드 사용
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("Hi");
		dcp.sendVoice("반갑습니다");
		dcp.hangUp();
		
//		Java26_4 자체적으로 존재하는 메서드 사용
		dcp.turnOnDmb();
		dcp.changeChannelDmb(11);
		dcp.turnOffDmb();
	}

}
