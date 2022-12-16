package JavaStudy01;

public class Java25_4 {
	private int speed;
	private boolean stop; 	//멤버변수의 초기값은 지정해주지 않아도 갖고 있음 (boolean 변수 => false
	
	
//	Getter와 Setter를 이용해 private 멤버변수에 접근 가능한 메서드를 생성하여 직접 접근이 불가능한 private 멤버변수에 우회 접근!
//	우회 접근 시 해당 데이터에 대한 추가 검증이 가능하다!
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {	
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
