package JavaStudy01;

public class Java30_3 {
	public int speed;
	public final int maxSpeed = 250;
	
	public void speedUp() {
		this.speed += 5;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
