package JavaStudy01;

public class Java38_9 {
	public void drive(Java38_6 vehicle) {
		if (vehicle instanceof Java38_7) {
			Java38_7 bus = (Java38_7) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
