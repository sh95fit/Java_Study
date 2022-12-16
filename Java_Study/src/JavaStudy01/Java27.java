package JavaStudy01;

// 	상속 관련 실습
/*
	문제1) Smart TV를 만들기 위해 APP 실행 메서드와 Internet 메서드를 생성하고,
		 TV의 기본 기능을 구현하기 위해 TV 클래스를 생성하여 전체 기능을 가지고 있는 Smart TV 만들기
	
		 TV 클래스 : 필드 - channel, volume, powerStatus
		 		   메서드 - powerOn(), powerOff(), channerUp(), channerDown(), volumeUp(), volumeDown()
		 Smart TV 클래스 : 필드 - url, userId
		                 메서드 - internetOn(), internetOff(), urlChange(), appStart(), appEnd(), appPlay()

*/

public class Java27 {

	public static void main(String[] args) {
		Java27_2 stv = new Java27_2();
		
		stv.powerOn();
		stv.volumeUp();
		stv.volumnDown();
		stv.channelUp();
		stv.channelChange(20);
		stv.channelDown();
		
		stv.internetOn();
		stv.urlChange("http://www.smart_phone.com");
		stv.internetOff();
		
		stv.appStart();
		stv.appPlay();
		stv.appEnd();
		
	}

}
