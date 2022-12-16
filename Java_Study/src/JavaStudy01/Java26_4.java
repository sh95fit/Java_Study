package JavaStudy01;

public class Java26_4 extends Java26_3 {
	public int channel;
	
	//생성자
	public Java26_4(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송을 수신합니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번 방송으로 변경합니다.");
	}
}
