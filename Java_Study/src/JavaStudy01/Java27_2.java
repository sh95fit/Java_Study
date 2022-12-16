package JavaStudy01;

public class Java27_2 extends Java27_1 {
	public String url;
	public String userId;
	
	public Java27_2() {
		url = "http://www.smart_tv.com";
		userId = "홍길동";
	}
	
	public void internetOn() {
		System.out.println("인터넷을 연결합니다.");
	}
	
	public void internetOff() {
		System.out.println("인터넷을 종료합니다.");
	}
	
	public void urlChange(String url) {
		System.out.println(url + " 주소로 접속합니다.");
	}
	
	public void appStart() {
		System.out.println("App을 시작합니다.");
	}
	
	public void appEnd() {
		System.out.println("App을 종료합니다.");
	}
	
	public void appPlay() {
		System.out.println(userId + "로 App을 사용합니다.");
	}

}
