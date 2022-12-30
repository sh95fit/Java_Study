package JavaStudy01;

public class Java38_4 {
	Java38_1 frontLeftTire = new Java38_2();
	Java38_1 frontRightTire = new Java38_2();
	Java38_1 backLeftTire = new Java38_2();
	Java38_1 backRightTire = new Java38_2();

	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
