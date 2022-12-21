package JavaStudy01;

public class Java29_2 extends Java29_1{
	
//	오버라이딩 : 상속 받은 클래스의 메서드의 소스코드를 수정하여 사용하는 것
//	오버라이딩 시 상속 받은 형태 그대로 사용해야 함
//	오버라이딩 시 상속받은 형태 그대로 사용하지 않을 경우 오버라이딩이 아닌 다른 메서드로 인식할 수 있음
	
	double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }

//	이름만 같은 오버라이딩된 메서드!
//	어노테이션을 통해 오버라이딩으로 사용할 메서드인지 아니면 새로 추가된 메서드인지 명확하게 하는 용도로 활용
//	@Override  : 부모 클래스로부터 받은 것과 다른 경우 오류를 띄움!
	double areaCircle(double r, double l) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r * l;
    }	
}
