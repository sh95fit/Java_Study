package JavaStudy01;


//Phone
public abstract class Java33_1 {
	public String owner;
	public Java33_1(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("휴대폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("휴대폰 전원을 끕니다.");
	}
}
