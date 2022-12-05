package JavaStudy01;

public class Java17_1 {

	public static void main(String[] args) {
		Java17 myCar = new Java17();
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최대시속 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 50;
		
		System.out.println("현재속도 : " + myCar.speed);
		
		Java17 yourCar = new Java17();
		yourCar.model = "아반떼";
		yourCar.color = "흰색";
		yourCar.maxSpeed = 230;
		yourCar.speed = 100;
		
		System.out.println("제작회사 : " + yourCar.company);
		System.out.println("모델명 : " + yourCar.model);
		System.out.println("색상 : " + yourCar.color);
		System.out.println("최대시속 : " + yourCar.maxSpeed);
		System.out.println("현재속도 : " + yourCar.speed);
		
		
		/*
		Java17 ex1 = new Java17();
		System.out.println("클래스 타입 변수 ex1이 Java17 객체를 참조");
		System.out.println(ex1);
		
		Java17 ex2 = new Java17();
		System.out.println("클래스 타입 변수 ex2이 Java17 객체를 참조");	
		System.out.println(ex2);
		*/
	}

}
