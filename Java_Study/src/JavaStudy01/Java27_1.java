package JavaStudy01;

public class Java27_1 {
	public int channel;
	public int volume;
	public boolean powerStatus;
	
	public Java27_1() {
		this(10,0);
	}
	
	public Java27_1(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		this.powerStatus = true;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		this.powerStatus = false;
	}
	
	public void channelUp() {
		System.out.println("채널을 위로 넘깁니다.");
		channel++;
		System.out.println(channel + "번");
	}
	
	public void channelDown() {
		System.out.println("채널을 아래로 넘깁니다.");
		channel--;
		System.out.println(channel + "번");
	}
	
	public void channelChange(int number) {
		this.channel = number;
		System.out.println(this.channel + "번으로 변경합니다.");
	}
	
	public void volumeUp() {
		System.out.println("볼륨을 높입니다.");
		volume++;
		System.out.println("현재 볼륨 : " + volume);
	}
	
	public void volumnDown() {
		System.out.println("볼륨을 낮춥니다.");
		volume--;
		System.out.println("현재 볼륨 : " + volume);
	}
}
