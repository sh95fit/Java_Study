package JavaStudy01;

/*
 부모 생성자 호출 (super())
 자식 객체를 생성하면 부모 객체도 생성되는가?
 부모가 없는 자식은 없으므로 자식 객체를 생성할 때에는 부모 객체부터 생성한 후 자식 객체 생성!
 부모 생성자 호출 완료 후 자식 생성자 호출
 super() : 부모 생성자 호출
 * 자식 클래스에서 super()를 사용할 시 코드의 가장 상단에 위치해야한다! (반드시 자식 생성자의 첫 줄!)
 
 명시적인 부모 생성자 호출
 부모 객체 생성 시, 부모 생성자를 선택해서 호출한다
 ex> super(매개값, ...)
     - 매개값과 동일한 타입, 개수, 순서를 맞춰 부모 생성자 호출
 부모 생성자가 없다면 컴파일 오류가 발생한다!
 부모 클래스에 생성자가 없는 경우 자식 생성자에서 super()를 생략할 수 있다!
 부모 클래스에 생성자가 있는 경우 자식 클래스에서 반드시 super()를 통해 생성자를 호출해주어야한다!
 */

public class Java28 {
    public static void main(String[] args) {
        Java28_2 student = new Java28_2("홍길동", "123456-1234567", 1);

        System.out.println("이름 : " + student.name);
        System.out.println("주민번호 : " + student.ssn);
        System.out.println("학번 : " + student.studentNo);

        Java28_1 p = new Java28_1("임꺽정", "123344-2233445");
        System.out.println("이름 : " + p.name);
        System.out.println("주민번호 : " + p.ssn);
    }
}
