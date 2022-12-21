package JavaStudy01;

/*
 메서드 재정의(Override)
 부모 클래스의 상속 메서드를 수정해 자식 클래스에서 재정의하여 활용 가능!

 메서드 재정의 조건
 부모 클래스의 메서드와 동일한 시그니처를 가져야 한다. (반환타입, 메서드명, 매개변수는 부모 클래스가 물려준 그대로 사용해야한다! )
 접근 제한을 더 강하게 조치하기 위한 오버라이딩은 불가능!
 (즉, public을 default나 private로 변경이 불가능하다! / 반대의 경우(default,private -> public)는 가능)
 새로운 예외(Exception) throws 불가

 @Override 어노테이션
 컴파일러에게 부모 클래스의 메서드 선언부와 동일한지 검사
 정확한 메서드 재정의를 위해 붙여주면 좋다

 메서드 재정의 효과
 실행되는 소스코드 변경이 가능하다
 부모 메서드는 숨겨지는 효과(재정의된 자식 메서드 실행)
 
 부모 메서드 사용(super)
 메서드 재정의는 재정의된 메서드만 출력하므로 부모 메서드를 숨기는 효과가 있다!
 자식 클래스에서 수정되기 전 부모 메서드를 호출할 때 사용!
 ex> super.부모메서드();
 
 오버로딩 vs 오버라이딩
 * 오버로딩 : 하나의 클래스 내 동일한 이름의 메서드가 여러개 존재하는 것
 * 오버라이딩 : 부모 클래스에서 상속 받은 메서드의 내용을 변경하여 사용하는 것
 */

public class Java29 {
    public static void main(String[] args) {
        int r = 10;
        int l = 20;
        
        Java29_1 cal = new Java29_1();
        System.out.println(" 원 면적 : " + cal.areaCircle(r));
        Java29_2 com = new Java29_2();
        System.out.println(" 원 면적 : " + com.areaCircle(r));
        System.out.println(" 원 면적 : " + com.areaCircle(r, l));
        
        System.out.println("\n\n");
        
        Java29_4 sa = new Java29_4();
        
        sa.takeOff();
        sa.fly();
        sa.flyMode = Java29_4.SUPERSONIC;
        sa.fly();
        sa.flyMode = Java29_4.NORMAL;
        sa.fly();
        sa.land();
    }
}
