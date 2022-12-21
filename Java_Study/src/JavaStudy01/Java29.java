package JavaStudy01;

/*
 메서드 재정의(Override)
 부모 클래스의 상속 메서드를 수정해 자식 클래스에서 재정의하여 활용 가능!

 메서드 재정의 조건
 부모 클래스의 메서드와 동일한 시그니처를 가져야 한다. (반환타입, 메서드명, 매개변수는 부모 클래스가 물려준 그대로 사용해야한다! )
 접근 제한을 더 강하게 조치하기 위한 오버라이딩은 불가능!
 (즉, public을 defalut나 private로 변경이 불가능하다! / 반대의 경우(default,private -> public)는 가능)
 새로운 예외(Exception) throws 불가

 @Override 어노테이션
 컴파일러에게 부모 클래스의 메서드 선언부와 동일한지 검사
 정확한 메서드 재정의를 위해 붙여주면 좋다

 메서드 재정의 효과
 실행되는 소스코드 변경이 가능하다
 부모 메서드는 숨겨지는 효과 발생(재정의된 자식 메서드 실행)
 */

public class Java29 {
    public static void main(String[] args) {
        int r = 10;
        
        Java29_1 cal = new Java29_1();
        System.out.println(" 원 면적 : " + cal.areaCircle(r));
        Java29_2 com = new Java29_2();
        System.out.println(" 원 면적 : " + com.areaCircle(r));

    }
}
