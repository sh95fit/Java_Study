package JavaStudy01;

public class Java25 {

	public static void main(String[] args) {
		Java25_3 acc1 = new Java25_3();
		acc1.ptrMember();
		
//		str1은 public으로 접근 제한이 없음
		System.out.println("str1 : " + acc1.str1);
//		str2는 defalut로 같은 패키지 내에서 접근 가능
		System.out.println("str2 : " + acc1.str2);
//		str3은 접근제한자가 private으로 설정되어 있어 해당 객체 외부에서 직접 호출할 수 없음
//		System.out.println("str3 : " + acc1.str3);

	}

}
