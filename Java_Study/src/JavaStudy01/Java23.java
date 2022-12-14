package JavaStudy01;

/*
 상수(static final)
 = 정적 final 필드!
 객체마다 가지고 있진 않음   <-> final 필드는 객체마다 가지는 불변의 인스턴스 필드로 의미가 다름!
 메소드 영역에 클래스별로 관리되는 불변의 정적 필드
 공용 데이터로서 활용된다
 
 관례
 상수 이름은 전부 대문자로 작성!
 다른 단어가 연결되면 '_'로 연결
 */

public class Java23 {

	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Java23_1.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적 : " + Java23_1.EARTH_SURFACE_AREA + " km^2");
	}

}
